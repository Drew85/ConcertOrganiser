package com.codeccol.raven.concert.model;

import java.math.BigDecimal;
import java.util.Random;

public class OutdoorConcert extends Concert{
    private static final int CAPACITY = 5000;
    private static final int DURATION = 120;
    private static final int RAIN_CHANCE = 30;
    private static final BigDecimal BEER_PRICE = new BigDecimal(800);

    public OutdoorConcert(Band mainBand, Band warmUpBand) {
        super(mainBand, warmUpBand, CAPACITY, DURATION, BEER_PRICE);
    }

    private Random random = new Random();

    public boolean isCanceled(){
        return random.nextInt(0,100) < RAIN_CHANCE ;
    }

    @Override
    public int sellTicketPieces() {
        if (this.isCanceled()){
            return 0;
        } else {
            return super.sellTicketPieces();
        }
    }

    @Override
    public String toString() {
        return "OutdoorConcert: " + "\n" +
                "            -> MainBand: " + super.getMainBand() +
                "            -> WarmUpBand: " + super.getWarmUpBand() +
                "               -> Capacity = " + super.getCapacity() + " Person" + "\n" +
                "               -> DurationInMinutes = " + super.getDurationInMinutes() + " Min" + "\n" +
                "               -> BeerPrice = " + "$" + super.getBeerPrice() + "\n"
                ;
    }
}
