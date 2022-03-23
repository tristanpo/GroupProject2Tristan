package com.syntax.Tasks;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
        } else {
            System.out.println("Valid email consider to be only yahoo");
        }
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Valid username cannot be empty and should be more than 6 characters");
        }
    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Valid password cannot contain username, password cannot be empty and should be more than 6 characters ");
        }
    }

    @Override
    public String toString() {
        return "Registration{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class TestRegistration {
    public static void main(String[] args) {
        Registration registration = new Registration();
        //registration.email="syntax@yahoo.com";   'email' has private access
        registration.setEmail("syntax@yahoo.com");
        registration.setUserName("syntax technology");
        registration.setPassword("123Batch122022");
        System.out.println(registration.toString());


    }

}