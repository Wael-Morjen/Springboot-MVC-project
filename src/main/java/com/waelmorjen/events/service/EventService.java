package com.waelmorjen.events.service;

import com.waelmorjen.events.dto.EventDto;

import java.util.List;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);

    List<EventDto> findAllEvents();

    EventDto findByEventId(Long eventId);
}
