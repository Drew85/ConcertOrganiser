package com.codeccol.raven.concert.model;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Concert {
    private Band mainBand;
    private Band warmUpBand;
    private int capacity;
//    private Style style;
    private int durationInMinutes;
    private BigDecimal ticketPrice;
    private static final BigDecimal MIN_PRICE = new BigDecimal("12000");
    private static final BigDecimal MAX_PRICE = new BigDecimal("15000");
    private static final int CHANCE_OF_FULL_HOUSE = 80;
    private static final int MIN_TICKETS_SOLD = 70;
    private static final int MAX_TICKETS_SOLD = 80;
    private BigDecimal beerPrice;

    private Random random = new Random();

    public int sellTicketPieces(){
        if (random.nextInt(0,100) >= CHANCE_OF_FULL_HOUSE){
            return this.capacity;
        }
            return (random.nextInt(MIN_TICKETS_SOLD, MAX_TICKETS_SOLD + 1)/100) * capacity;
    }

    public Concert(Band mainBand, Band warmUpBand, int capacity, int durationInMinutes, BigDecimal ticketPrice, BigDecimal beerPrice) {
        this.mainBand = mainBand;
        this.warmUpBand = warmUpBand;
        this.capacity = capacity;
        this.durationInMinutes = durationInMinutes;
        this.ticketPrice = ticketPrice;
        this.beerPrice = beerPrice;
    }

    public Concert(Band mainBand, Band warmUpBand, int capacity, int durationInMinutes, BigDecimal beerPrice) {
        this.mainBand = mainBand;
        this.warmUpBand = warmUpBand;
        this.capacity = capacity;
        this.durationInMinutes = durationInMinutes;
        this.ticketPrice = new BigDecimal(random.nextInt(MIN_PRICE.intValue(), MAX_PRICE.intValue()));
        this.beerPrice = beerPrice;
    }

    public Band getMainBand() {
        return mainBand;
    }

    public Band getWarmUpBand() {
        return warmUpBand;
    }

    public int getCapacity() {
        return capacity;
    }

    public Style getStyle() {
        return mainBand.getStyle();
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public BigDecimal getBeerPrice() {
        return beerPrice;
    }
}
