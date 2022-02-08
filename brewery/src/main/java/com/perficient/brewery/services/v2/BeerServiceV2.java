package com.perficient.brewery.services.v2;

import com.perficient.brewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 savedNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);

    BeerDtoV2 getBeerById(UUID beerId);
}
