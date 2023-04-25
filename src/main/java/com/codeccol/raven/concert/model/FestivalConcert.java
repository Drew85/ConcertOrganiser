package com.codeccol.raven.concert.model;

import java.math.BigDecimal;

public class FestivalConcert extends Concert{
    private static final int CAPACITY = 8000;
    private static final int DURATION = 360;
    private static final BigDecimal BEER_PRICE = new BigDecimal(1000);

    public FestivalConcert(Band mainBand, Band warmUpBand) {
        super(mainBand, warmUpBand, CAPACITY, DURATION, BEER_PRICE);
    }


    @Override
    public int sellTicketPieces() {
        return 0;
    }

    @Override
    public String toString() {
        return "FestivalConcert: " + "\n" +
                "            -> MainBand: " + super.getMainBand() +
                "            -> WarmUpBand: " + super.getWarmUpBand() +
                "               -> Capacity = " + super.getCapacity() + " Person" + "\n" +
                "               -> DurationInMinutes = " + super.getDurationInMinutes() + " Min" + "\n" +
                "               -> BeerPrice = " + "$" + super.getBeerPrice() + "\n"
                ;
    }
}
