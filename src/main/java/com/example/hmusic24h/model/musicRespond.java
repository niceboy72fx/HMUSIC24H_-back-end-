package com.example.hmusic24h.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import javax.persistence.Entity;

@Controller
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class musicRespond {
    private String status;
    private String message;
    private Object data;
}
