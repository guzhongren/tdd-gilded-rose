package cn.xpbootcamp.gildedrose;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AgedBrieTest {
    @Test
    public void should_return_sellIn_1_quality_1_when_agedBrie_pass_1_day_given_sellIn_2_quality_0 () {
        AgedBrie agedBrie = new AgedBrie(2,0);
        agedBrie.passOneDay();
        assertThat(agedBrie.getSellIn()).isEqualTo(1);
        assertThat(agedBrie.getQuality()).isEqualTo(1);
    }

    @Test
    public void should_return_sellIn_1_quality_50_when_agedBrie_pass_1_day_given_sellIn_2_quality_49 () {
        AgedBrie agedBrie = new AgedBrie(2,49);
        agedBrie.passOneDay();
        assertThat(agedBrie.getSellIn()).isEqualTo(1);
        assertThat(agedBrie.getQuality()).isEqualTo(50);
    }
    @Test
    public void should_return_sellIn_1_quality_50_when_agedBrie_pass_1_day_given_sellIn_2_quality_50 () {
        AgedBrie agedBrie = new AgedBrie(2,50);
        agedBrie.passOneDay();
        assertThat(agedBrie.getSellIn()).isEqualTo(1);
        assertThat(agedBrie.getQuality()).isEqualTo(50);
    }
    @Test
    public void should_return_sellIn_n1_quality_22_when_agedBrie_pass_1_day_given_sellIn_0_quality_20 () {
        AgedBrie agedBrie = new AgedBrie(0,20);
        agedBrie.passOneDay();
        assertThat(agedBrie.getSellIn()).isEqualTo(-1);
        assertThat(agedBrie.getQuality()).isEqualTo(22);
    }
    @Test
    public void should_return_sellIn_negative_2_quality_22_when_agedBrie_pass_1_day_given_sellIn_negative_1_quality_20 () {
        AgedBrie agedBrie = new AgedBrie(-1,20);
        agedBrie.passOneDay();
        assertThat(agedBrie.getSellIn()).isEqualTo(-2);
        assertThat(agedBrie.getQuality()).isEqualTo(22);
    }
}
