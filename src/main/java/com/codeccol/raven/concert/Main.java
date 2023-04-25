package com.codeccol.raven.concert;

import com.codeccol.raven.concert.model.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ConcertOrganiser concertOrganiser = new ConcertOrganiser();

        Band bandMain = new Band("TCs", Style.ROCK);
        Band bandWarmUp = new Band("A&M", Style.ROCK);

        OutdoorConcert outdoorConcert = new OutdoorConcert(bandMain, bandWarmUp);
        IndoorConcert indoorConcert = new IndoorConcert(bandMain, bandWarmUp);
        FestivalConcert festivalConcert = new FestivalConcert(bandMain, bandWarmUp);

        IndoorConcert indoorConcert1 = new IndoorConcert(bandMain, bandWarmUp, new BigDecimal("15000"));

        concertOrganiser.addConcert(outdoorConcert);
        concertOrganiser.addConcert(indoorConcert);
        concertOrganiser.addConcert(festivalConcert);
        concertOrganiser.addConcert(indoorConcert1);

        System.out.println(concertOrganiser.getConcerts());
    }
}