package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class NormalGoodsTest {
    @Test
    public void should_return_sellIn_9_quality_19_when_normal_product_pass_1_day_given_sellIn_10_quality_20(){
        NormalGoods normalGoods = new NormalGoods(10,20);
        normalGoods.passOneDay();
        assertThat(normalGoods.getSellIn()).isEqualTo(9);
        assertThat(normalGoods.getQuality()).isEqualTo(19);
    }

    @Test
    public void should_return_sellIn_1_quality_0_when_normal_product_pass_1_day_given_sellIn_2_quality_0(){
        NormalGoods normalGoods = new NormalGoods(2,0);
        normalGoods.passOneDay();
        assertThat(normalGoods.getSellIn()).isEqualTo(1);
        assertThat(normalGoods.getQuality()).isEqualTo(0);
    }
}
