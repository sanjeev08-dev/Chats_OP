package com.example.chatsop.Model;

public class Banned {
    boolean haveAccount;

    public Banned() {
    }

    public Banned(boolean haveAccount) {
        this.haveAccount = haveAccount;
    }

    public boolean isHaveAccount() {
        return haveAccount;
    }

    public void setHaveAccount(boolean haveAccount) {
        this.haveAccount = haveAccount;
    }
}
