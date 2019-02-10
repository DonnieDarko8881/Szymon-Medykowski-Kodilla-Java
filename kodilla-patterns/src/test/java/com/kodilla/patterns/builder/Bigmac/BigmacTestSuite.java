package com.kodilla.patterns.builder.Bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import com.kodilla.patterns.builder.bigmac.Bun;
import com.kodilla.patterns.builder.bigmac.Ingredients;
import com.kodilla.patterns.builder.bigmac.Sauce;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void shouldReturnBigmacWith2ingredientsAndBunWithOutSezam() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.WITH_OUT_SEZAM)
                .burgers(2)
                .sauce(Sauce.BARBEQUE)
                .ingredients(Ingredients.BACON)
                .ingredients(Ingredients.CHEESE)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        Bun howBun = bigmac.getBun();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals(Bun.WITH_OUT_SEZAM,howBun);
    }

    @Test
    public void shouldReturnBigmacWithNullSauce() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.WITH_OUT_SEZAM)
                .burgers(2)
                .ingredients(Ingredients.BACON)
                .ingredients(Ingredients.CHEESE)
                .build();
        System.out.println(bigmac);
        //When
        Sauce resultSauce = bigmac.getSauce();
        //Then
        Assert.assertEquals(null, resultSauce);
    }
}
