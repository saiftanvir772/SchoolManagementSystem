/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsn;

/**
 *
 * @author saift
 */
public class Notice {
    private String date;
    private String noticeNo;
    private String notice;

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the noticeNo
     */
    public String getNoticeNo() {
        return noticeNo;
    }

    /**
     * @param noticeNo the noticeNo to set
     */
    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    /**
     * @return the notice
     */
    public String getNotice() {
        return notice;
    }

    /**
     * @param notice the notice to set
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }
    
    public Notice(String date, String noticeNo, String notice){
        this.date = date;
        this.noticeNo = noticeNo;
        this.notice = notice;
    }
}
