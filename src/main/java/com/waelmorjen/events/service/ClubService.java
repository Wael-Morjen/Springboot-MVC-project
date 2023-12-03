package com.waelmorjen.events.service;

import com.waelmorjen.events.dto.ClubDto;
import com.waelmorjen.events.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();

    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(long clubId);

    void updateClub(ClubDto club);
}
