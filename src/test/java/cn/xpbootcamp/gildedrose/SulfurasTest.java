package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SulfurasTest {
    @Test
    public void should_return_sellIn_0_quality_45_when_sulfuras_pass_1_day_given_sellIn_0_quality_45 () {
        Sulfuras sulfuras = new Sulfuras(0,45);
        sulfuras.passOneDay();
        assertThat(sulfuras.getSellIn()).isEqualTo(0);
        assertThat(sulfuras.getQuality()).isEqualTo(45);
    }

    @Test
    public void should_return_sellIn_negative_1_quality_45_when_sulfuras_pass_1_day_given_sellIn_negative_1_quality_45 () {
        Sulfuras sulfuras = new Sulfuras(-1,45);
        sulfuras.passOneDay();
        assertThat(sulfuras.getSellIn()).isEqualTo(-1);
        assertThat(sulfuras.getQuality()).isEqualTo(45);
    }

    @Test
    public void should_return_sellIn_negative_1_quality_50_when_sulfuras_pass_1_day_given_sellIn_negative_1_quality_50 () {
        Sulfuras sulfuras = new Sulfuras(-1,50);
        sulfuras.passOneDay();
        assertThat(sulfuras.getSellIn()).isEqualTo(-1);
        assertThat(sulfuras.getQuality()).isEqualTo(50);
    }
    @Test
    public void should_return_sellIn_negative_1_quality_1_when_sulfuras_pass_1_day_given_sellIn_negative_1_quality_1 () {
        Sulfuras sulfuras = new Sulfuras(-1,1);
        sulfuras.passOneDay();
        assertThat(sulfuras.getSellIn()).isEqualTo(-1);
        assertThat(sulfuras.getQuality()).isEqualTo(1);
    }
    @Test
    public void should_return_sellIn_negative_2_quality_1_when_sulfuras_pass_1_day_given_sellIn_negative_2_quality_1 () {
        Sulfuras sulfuras = new Sulfuras(-2,1);
        sulfuras.passOneDay();
        assertThat(sulfuras.getSellIn()).isEqualTo(-2);
        assertThat(sulfuras.getQuality()).isEqualTo(1);
    }
}
