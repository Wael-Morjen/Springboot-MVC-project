package com.waelmorjen.events.service.impl;

import com.waelmorjen.events.dto.EventDto;
import com.waelmorjen.events.models.Club;
import com.waelmorjen.events.models.Event;
import com.waelmorjen.events.repository.ClubRepository;
import com.waelmorjen.events.repository.EventRepository;
import com.waelmorjen.events.service.EventService;
import org.springframework.stereotype.Service;

import static com.waelmorjen.events.mapper.EventMapper.mapToEvent;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;
    private ClubRepository clubRepository;

    public EventServiceImpl(EventRepository eventRepository, ClubRepository clubRepository) {
        this.eventRepository = eventRepository;
        this.clubRepository = clubRepository;
    }

    @Override
    public void createEvent(Long clubId, EventDto eventDto) {
        Club club = clubRepository.findById(clubId).get();
        Event event = mapToEvent(eventDto);
        event.setClub(club);
        eventRepository.save(event);
    }
}
