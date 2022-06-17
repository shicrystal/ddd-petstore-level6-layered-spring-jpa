package com.demo.reservation.domain;


import javax.persistence.*;


@Entity

public class Reservation {

    @Id @GeneratedValue
    Long reservedId;
    ReservationStatus status;    //예약상태
    long dogwalkerScheduleId;    //스케줄ID
    long walkId;    //산책ID
    String userId;  //예약자(댕주인)ID

    public Reservation(){
        setStatus(ReservationStatus.REQUESTED);
    }

    public Long getReservedId() {
        return reservedId;
    }
    public void setReservedId(Long reservedId) {
        this.reservedId = reservedId;
    }
    public ReservationStatus getStatus() {
        return status;
    }
    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
    public long getDogwalkerScheduleId() {
        return dogwalkerScheduleId;
    }
    public void setDogwalkerScheduleId(long dogwalkerScheduleId) {
        this.dogwalkerScheduleId = dogwalkerScheduleId;
    }
    public long getWalkId() {
        return walkId;
    }
    public void setWalkId(long walkId) {
        this.walkId = walkId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void cancel(Long reservedId){

    }

    public void confirm(Long reservedId){

    }

    public void walkStart(Long reservedId){


    }

    public void walkEnd(Long reservedId){

    }


}
