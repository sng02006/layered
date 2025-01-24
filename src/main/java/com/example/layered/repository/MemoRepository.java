package com.example.layered.repository;

import com.example.layered.dto.MemoRequestDto;
import com.example.layered.entity.Memo;

public interface MemoRepository {

    Memo saveMemo(Memo memo);
}
