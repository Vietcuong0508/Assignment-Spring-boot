package com.example.assignmentspringboot.entity;

import com.example.assignmentspringboot.entity.base.BaseEntity;
import com.example.assignmentspringboot.entity.enums.UserRole;
import com.example.assignmentspringboot.entity.enums.UserStatus;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Inheritance
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "Fullname cannot be empty")
    private String fullName;
    private String avatar;
    @NotEmpty(message = "Username cannot be empty")
    private String username;
    @NotEmpty(message = "Password cannot be empty")
    private String password;
    @NotEmpty(message = "Email cannot be empty")
    private String email;
    @NotEmpty(message = "Phone cannot be empty")
    private String phone;
    @NotEmpty(message = "Address cannot be empty")
    private String address;
    private UserStatus status;
    private UserRole role;
}