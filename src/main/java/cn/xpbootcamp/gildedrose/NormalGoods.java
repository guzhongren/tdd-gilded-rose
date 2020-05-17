package cn.xpbootcamp.gildedrose;

public class NormalGoods {
    private int sellIn;
    private int quality;

    public NormalGoods(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void passOneDay() {
        this.sellIn--;
        if (this.quality > 0) {
            this.quality--;
        }else {
            this.quality = 0;
        }
    }
}
