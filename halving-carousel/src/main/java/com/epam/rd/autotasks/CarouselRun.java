package com.epam.rd.autotasks;

public class CarouselRun {
    protected final int[] array = DecrementingCarousel.container.clone();
    int i =0;
    private boolean halving = false;

    public int next() {
        if (isFinished())
            return -1;
        if(halving == false) {
            while (array[i %= array.length] <= 0) {
                i++;
            }
            return array[i++]--;
        } else {
            while (array[i %= array.length] <= 0) {
                i++;
            }
            int temp = array[i];
            array[i]=array[i]/2;
            i++;
            return temp;
        }
    }
    public boolean isFinished() {
        for (int count : array)
            if (count > 0){
                return false;
            }
        return true;
    }
    public boolean isHalving() {
        return halving;
    }
    public void setHalving(boolean halving) {
        this.halving = halving;
    }
}
