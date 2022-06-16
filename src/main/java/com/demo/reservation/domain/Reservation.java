package com.demo.reservation.domain;

import java.util.Date;

import javax.persistence.*;

import org.springframework.web.bind.annotation.SessionAttributes;


@Entity
public class Reservation {

    @Id @GeneratedValue
    Long reservedId;

    Integer amount;    //지불금액
    ReservationStatus status;    //예약상태
    long walkId;    //산책ID

    Date walkingStart; // 산책 시작 일자
    Date walkingEnd ;          // 산책 종료 일자
    
    String walkingStartTime;   // 산책 시작 시간 (01~24시)
    String walkingEndTime;     // 산책 종료 시간 (01~24시)
    String userId;  //예약자(댕주인)ID

    public Long getReservedId() {
        return reservedId;
    }
    public void setReservedId(Long reservedId) {
        this.reservedId = reservedId;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public ReservationStatus getStatus() {
        return status;
    }
    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
    public long getWalkId() {
        return walkId;
    }
    public void setWalkId(long walkId) {
        this.walkId = walkId;
    }
    public Date getWalkingStart() {
        return walkingStart;
    }
    public void setWalkingStart(Date walkingStart) {
        this.walkingStart = walkingStart;
    }
    public Date getWalkingEnd() {
        return walkingEnd;
    }
    public void setWalkingEnd(Date walkingEnd) {
        this.walkingEnd = walkingEnd;
    }
    public String getWalkingStartTime() {
        return walkingStartTime;
    }
    public void setWalkingStartTime(String walkingStartTime) {
        this.walkingStartTime = walkingStartTime;
    }
    public String getWalkingEndTime() {
        return walkingEndTime;
    }
    public void setWalkingEndTime(String walkingEndTime) {
        this.walkingEndTime = walkingEndTime;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }


}
