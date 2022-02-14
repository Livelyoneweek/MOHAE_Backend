package com.sparta.miniproject0212.service;


import com.sparta.miniproject0212.dto.SignupRequestDto;
import com.sparta.miniproject0212.model.User;
import com.sparta.miniproject0212.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    public void registerUser(SignupRequestDto signupRequestDto ) {

        String username = chekUsername(signupRequestDto);

        // 패스워드 암호화
        String encodepassword = passwordEncoder.encode(signupRequestDto.getPassword());
        String nickname = signupRequestDto.getNickname();
        User user = new User(username,nickname,encodepassword);
        userRepository.save(user);
    }


    // username 중복 함수
    public String chekUsername(SignupRequestDto signupRequestDto) {
        String username = signupRequestDto.getUsername();
        Optional<User> found = userRepository.findByUsername(username);

        if (found.isPresent()) {
            throw new IllegalArgumentException("중복된 사용자 ID 가 존재합니다.");
        }

        return username;
    }



}
