package com.cn.tacocloud2021;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Order {
    @NotBlank
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
