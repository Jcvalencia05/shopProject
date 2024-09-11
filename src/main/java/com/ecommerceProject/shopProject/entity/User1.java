package com.ecommerceProject.shopProject.entity;

import com.ecommerceProject.shopProject.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="users")

public class User1 {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;

    private String email;

    private String password;

    private String name;

    private UserRole Role;

    @Lob
    @Column(columnDefinition="longblob")

    private byte [] img;

}
