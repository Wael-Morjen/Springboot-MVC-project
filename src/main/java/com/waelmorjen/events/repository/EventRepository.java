package com.waelmorjen.events.repository;

import com.waelmorjen.events.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}
