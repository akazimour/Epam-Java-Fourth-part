package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel{

    public HalvingCarousel(final int capacity) {
        super(capacity);

    }
    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            CarouselRun carouselRun = new CarouselRun();
            carouselRun.setHalving(true);
            return carouselRun;
        }
        return null;
    }
}

