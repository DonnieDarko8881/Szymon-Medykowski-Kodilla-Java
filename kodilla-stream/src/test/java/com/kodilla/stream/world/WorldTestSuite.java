package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;

public class WorldTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void ReturnQuantityPeopleOfWord() {


        //Given
        Country poland = new Country("Poland", new BigDecimal("4000000"));
        Country bulgarian = new Country("Bulgarian", new BigDecimal("7000000"));
        Country lithuania = new Country("Lithuania", new BigDecimal("2840000"));

        Country brasil = new Country("Brasil", new BigDecimal("209000000"));
        Country argentina = new Country("Argentina", new BigDecimal("44000000"));
        Country chile = new Country("Chile", new BigDecimal("18500000"));

        Continent europe = new Continent("Europe");
        Continent southAmerica = new Continent("South America");

        World world = new World();

        //When
        europe.addCountryToContinent(poland);
        europe.addCountryToContinent(bulgarian);
        europe.addCountryToContinent(lithuania);

        southAmerica.addCountryToContinent(brasil);
        southAmerica.addCountryToContinent(argentina);
        southAmerica.addCountryToContinent(chile);

        world.addContinentToWord(europe);
        world.addContinentToWord(southAmerica);

        int sumQuantityPeopleOfCountryCalculateMyself = 4000000 + 7000000 + 2840000 + 209000000 + 44000000 + 18500000;
        BigDecimal QuantityPeopleOfWorld = world.getTotalPeopleWordQuantity();

        //Then
        Assert.assertEquals(sumQuantityPeopleOfCountryCalculateMyself, QuantityPeopleOfWorld.intValue());
    }
}
