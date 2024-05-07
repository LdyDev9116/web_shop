package com.freshkit.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor

@Data
public class UserDTO {

        private Integer id;
        private String username;
        private String password;
        private String email;
        private LocalDateTime createdAt;

        // 기본 생성자
        public UserDTO() {
        }

        // 매개변수가 있는 생성자
        public UserDTO(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        // getter 및 setter 메소드
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
        }

        // toString() 메소드
        @Override
        public String toString() {
            return "UserDTO{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", email='" + email + '\'' +
                    ", createdAt=" + createdAt +
                    '}';
        }
}