package com.example.layered.controller;

import com.example.layered.dto.MemoRequestDto;
import com.example.layered.dto.MemoResponseDto;
import com.example.layered.entity.Memo;
import com.example.layered.service.MemoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // @Controller + @ResponseBody
@RequestMapping("/memos") // Prefix
public class MemoController {

    private final MemoService memoService;

    public MemoController(MemoService memoService) {
        this.memoService = memoService;
    }

    @PostMapping
    public ResponseEntity<MemoResponseDto> createMemo(@RequestBody MemoRequestDto dto) {
        // Service Layer 호출, 응답
        return new ResponseEntity<>(memoService.saveMemo(dto), HttpStatus.CREATED);
    }

    // responseEntity에 담는 걸로 변경하기
    @GetMapping
    public List<MemoResponseDto> findAllMemos() {

        return memoService.findAllMemos();
    }
}