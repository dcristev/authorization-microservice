package com.examplatform.gateway.presentation.auth.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
public class LoginForm {

    @NotBlank(message = "Username must not be blank!")
    @Email(message = "Invalid email format!")
    @Size(min = 3, max = 40, message = "Username must be between 3 and 40 characters!")
    private String email;

    @NotBlank(message = "Password must not be blank!")
    @Size(min = 8, max = 25, message = "Password must be between 8 and 25 characters!")
    private String password;
}
