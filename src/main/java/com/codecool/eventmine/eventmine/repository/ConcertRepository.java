package com.codecool.eventmine.eventmine.repository;

import com.codecool.eventmine.eventmine.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository extends JpaRepository<Concert, Long> {
}
