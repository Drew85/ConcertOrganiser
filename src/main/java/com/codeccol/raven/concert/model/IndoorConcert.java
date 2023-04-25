package com.codeccol.raven.concert.model;

import java.math.BigDecimal;

public class IndoorConcert extends Concert{

    private static final int CAPACITY = 3000;
    private static final int DURATION = 90;
    private static final BigDecimal BEER_PRICE = new BigDecimal("600");

    public IndoorConcert(Band mainBand, Band warmUpBand) {
        super(mainBand, warmUpBand, CAPACITY, DURATION, BEER_PRICE);
    }

    public IndoorConcert(Band mainBand, Band warmUpBand, BigDecimal ticketPrice) {
        super(mainBand, warmUpBand, CAPACITY, DURATION, ticketPrice, BEER_PRICE);
    }

    @Override
    public int sellTicketPieces() {
        return 0;
    }

    @Override
    public String toString() {
        return "IndoorConcert: " + "\n" +
                "            -> MainBand: " + super.getMainBand() +
                "            -> WarmUpBand: " + super.getWarmUpBand() +
                "               -> Capacity = " + super.getCapacity() + " Person" + "\n" +
                "               -> DurationInMinutes = " + super.getDurationInMinutes() + " Min" + "\n" +
                "               -> TicketPrice = " + "$" + super.getTicketPrice() + "\n" +
                "               -> BeerPrice = " + "$" + super.getBeerPrice() + "\n"
                ;
    }
}