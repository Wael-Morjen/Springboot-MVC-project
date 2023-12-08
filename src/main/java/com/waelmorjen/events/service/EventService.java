package com.waelmorjen.events.service;

import com.waelmorjen.events.dto.EventDto;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
}
