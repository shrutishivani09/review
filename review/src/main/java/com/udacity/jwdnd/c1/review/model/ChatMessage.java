package com.udacity.jwdnd.c1.review.model;

public class ChatMessage {
    Integer messageId;
    String username;
    String messageText;

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }
}
