package com.iconique.user_servce.dto;

public record UserRequest(String userName,
                          String password,
                          String email,
                          String firstName,
                          String lastName,
                          String middleName,
                          String no,
                          String firstLine,
                          String secondLine,
                          String province,
                          String zipCode,
                          String mobileNo) {
}
