package com.example.layered.service;

import com.example.layered.dto.MemoRequestDto;
import com.example.layered.dto.MemoResponseDto;

import java.util.List;

public interface MemoService {
    MemoResponseDto saveMemo(MemoRequestDto dto);
    List<MemoResponseDto> findAllMemos();
    MemoResponseDto findMemoById(long id);
    MemoResponseDto updateMemo(Long id, String title, String contents);
    MemoResponseDto updateTitle(Long id, String title, String contents);
    void deleteMemo(long id);
}
