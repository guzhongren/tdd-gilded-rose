package cn.xpbootcamp.gildedrose;

public class BackstagePass {
    private int sellIn;
    private int quality;

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public BackstagePass(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void passOneDay() {
        if (this.sellIn <= 0) {
            this.quality = 0;
        } else if (this.sellIn <= 5) {
            this.quality += 3;
        } else if (this.sellIn <= 10) {
            this.quality += 2;
        } else {

            this.quality++;
        }
        this.quality = Math.min(50, this.quality);
        this.sellIn--;
    }
}
