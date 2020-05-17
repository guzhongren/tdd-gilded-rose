package cn.xpbootcamp.gildedrose;

public class AgedBrie {
    private int sellIn;
    private int quality;

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public AgedBrie(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void passOneDay() {
        if(this.sellIn <= 0) {
            this.quality += 2;
        } else {
            this.quality ++;
        }
        this.quality = Math.min(50, this.quality);
        this.sellIn--;

    }
}
