package com.pepsico.agile.events.beans;

public class NotificationBean
{

    private String notificationSubject = "";
    private String notificationBody    = "";


    public String getNotificationSubject()
    {
        return notificationSubject;
    }


    public void setNotificationSubject(String notificationSubject)
    {
        this.notificationSubject = notificationSubject;
    }


    public String getNotificationBody()
    {
        return notificationBody;
    }


    public void setNotificationBody(String notificationBody)
    {
        this.notificationBody = notificationBody;
    }
}
