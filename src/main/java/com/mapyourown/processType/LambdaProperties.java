package com.mapyourown.processType;

public class LambdaProperties {

    private String accountId;
    private String authToken;
    private String twilioPhone;


    public LambdaProperties() {

        this.accountId="account_sid";
        this.authToken="auth_token";
        this.twilioPhone="twilo provision number";
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getTwilioPhone() {
        return twilioPhone;
    }

    public void setTwilioPhone(String twilioPhone) {
        this.twilioPhone = twilioPhone;
    }



}
