package com.waelmorjen.events.service;

import com.waelmorjen.events.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
