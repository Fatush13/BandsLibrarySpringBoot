package com.example.Bands.repos;

import com.example.Bands.domain.Band;
import org.springframework.data.repository.CrudRepository;

public interface BandRepo extends CrudRepository<Band, Long> {
}
