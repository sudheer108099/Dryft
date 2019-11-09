package com.Dryft.models;

class User {
    private String fullname;
    private String email;
    private String password;
    private String salt;
    private char sex;
    private int balance;

    public User(String fullname, String email, String password, String salt, char sex, int balance) {
        setFullname(fullname);
        setEmail(email);
        setPassword(password);
        setSalt(salt);
        setSex(sex);
        setBalance(balance);
        writeToDB();
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public char getSex() {
        return sex;
    }

    public int getBalance() {
        return balance;
    }

    private void writeToDB() {
        // to be coded
    }
}
