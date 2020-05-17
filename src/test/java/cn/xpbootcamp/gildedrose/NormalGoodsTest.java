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

    @Test
    public void should_return_sellIn_2_quality_5_when_normal_product_pass_1_day_given_sellIn_3_quality_6(){
        NormalGoods normalGoods = new NormalGoods(3,6);
        normalGoods.passOneDay();
        assertThat(normalGoods.getSellIn()).isEqualTo(2);
        assertThat(normalGoods.getQuality()).isEqualTo(5);
    }
    @Test
    public void should_return_sellIn_2_quality_50_when_normal_product_pass_1_day_given_sellIn_3_quality_51(){
        NormalGoods normalGoods = new NormalGoods(3,51);
        normalGoods.passOneDay();
        assertThat(normalGoods.getSellIn()).isEqualTo(2);
        assertThat(normalGoods.getQuality()).isEqualTo(50);
    }

    @Test
    public void should_return_sellIn_1_negative_quality_4_when_normal_product_pass_1_day_given_sellIn_0_quality_6(){
        NormalGoods normalGoods = new NormalGoods(0,6);
        normalGoods.passOneDay();
        assertThat(normalGoods.getSellIn()).isEqualTo(-1);
        assertThat(normalGoods.getQuality()).isEqualTo(4);
    }

    @Test
    public void should_return_sellIn_n2_quality_4_when_normal_product_pass_1_day_given_sellIn_n1_quality_6(){
        NormalGoods normalGoods = new NormalGoods(-1,6);
        normalGoods.passOneDay();
        assertThat(normalGoods.getSellIn()).isEqualTo(-2);
        assertThat(normalGoods.getQuality()).isEqualTo(4);
    }

}
