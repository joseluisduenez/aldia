package com.hexaware.hackathon.aldia.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.hackathon.aldia.domain.UserInfo;
import com.hexaware.hackathon.aldia.exception.ValidationException;
import com.hexaware.hackathon.aldia.repository.UserInfoRepository;

import java.security.NoSuchAlgorithmException;
import java.util.Map;

@RestController
public class UserInfoController {


    final
    private UserInfoRepository userInfoRepository;

//    private HashData hashData = new HashData();

    public UserInfoController(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }


    @PostMapping("/user")
    public Boolean create(@RequestBody Map<String, String> body) throws NoSuchAlgorithmException {
        String username = body.get("username");
        if (userInfoRepository.existsByUsername(username)){

            throw new ValidationException("Username already existed");

        }

        String password = body.get("password");
        String encodedPassword = new BCryptPasswordEncoder().encode(password);
//        String hashedPassword = hashData.get_SHA_512_SecurePassword(password);
        String role = body.get("role");
        userInfoRepository.save(new UserInfo(username, encodedPassword, role));
        return true;
    }

}

