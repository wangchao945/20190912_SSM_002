package com.itheima.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vo {
    private List<Integer> ids;

}
