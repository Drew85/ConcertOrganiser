package com.codeccol.raven.concert;

import com.codeccol.raven.concert.model.Band;
import com.codeccol.raven.concert.model.Concert;

import java.util.ArrayList;
import java.util.List;

public class ConcertOrganiser {
    private List<Concert> concerts = new ArrayList<>();
    public void addConcert(Concert concert){
        concerts.add(concert);
    }

    private List<Band> bands = new ArrayList<>();

    private List<Band> warmUpBands = new ArrayList<>();

    public void addBand(Band band){
        bands.add(band);
    }

    public void addWarmUpBands(Band band){
        warmUpBands.add(band);
    }

    public List<Concert> getConcerts() {
        return concerts;
    }
}
