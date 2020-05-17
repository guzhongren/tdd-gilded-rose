package cn.xpbootcamp.gildedrose;

public class AgedBrie {
    private int sellIn;
    private int quality;

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public AgedBrie(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void passOneDay() {
        this.sellIn--;
        this.quality = Math.min(50, this.quality += 1);

    }
}
