package com.sharekit.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalLoginRequest {
    private String studentId;
    private String password;
}