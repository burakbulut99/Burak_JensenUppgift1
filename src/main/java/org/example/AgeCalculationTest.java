package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgeCalculationTest {

    @Test
    public void calculationTestWithValidNameAndValidAge(){

        AgeCalculation ageCalculation = new AgeCalculation();

        assertEquals("Hej Anna, du är född år 1991", ageCalculation.ageCalculation("Anna","32"));

        assertEquals("Hej Mike, du är född år 1960", ageCalculation.ageCalculation("Mike","63"));

        assertEquals("Hej Annelie, du är född år 2004", ageCalculation.ageCalculation("    Annelie","19"));

        assertEquals("Hej Mona, du är född år 2001", ageCalculation.ageCalculation("  Mona    ","22"));

        assertEquals("Hej Per Ulf, du är född år 1980", ageCalculation.ageCalculation("Per Ulf","43"));

        assertEquals("Hej Sana, du är född år 1990", ageCalculation.ageCalculation("Sana","     33"));

        assertEquals("Hej Gustaf Kung, du är född år 1870", ageCalculation.ageCalculation("   Gustaf Kung  ","  153  "));
    }

    @Test
    public void calculationTestWithValidNameAndInvalidAge(){

        AgeCalculation ageCalculation = new AgeCalculation();

        assertEquals("Age is invalid", ageCalculation.ageCalculation("John","0"));

        assertEquals("Age is invalid", ageCalculation.ageCalculation("Adam","-1"));

        assertEquals("Age is invalid", ageCalculation.ageCalculation("Annie","200"));

        assertEquals("Age is invalid", ageCalculation.ageCalculation("Axel",""));

        assertEquals("Age is invalid", ageCalculation.ageCalculation("Erik","abc"));

        assertEquals("Age is invalid", ageCalculation.ageCalculation("Keith","?!.,;"));

    }

    @Test
    public void calculationTestWithInvalidNameAndValidAge(){

        AgeCalculation ageCalculation = new AgeCalculation();

        assertEquals("Name is invalid", ageCalculation.ageCalculation("","44"));

        assertEquals("Name is invalid", ageCalculation.ageCalculation(null,"55"));

        assertEquals("Name is invalid", ageCalculation.ageCalculation("03389","11"));

        assertEquals("Name is invalid", ageCalculation.ageCalculation("Ande34r78s","21"));


    }

    @Test
    public void calculationTestWithInvalidNameAndInvalidAge(){

        AgeCalculation ageCalculation = new AgeCalculation();

        assertEquals("Both age and name is invalid", ageCalculation.ageCalculation("A8b2m9","0"));

        assertEquals("Both age and name is invalid", ageCalculation.ageCalculation("","200"));

        assertEquals("Both age and name is invalid", ageCalculation.ageCalculation(null,"201"));

        assertEquals("Both age and name is invalid", ageCalculation.ageCalculation("201","ab13"));

        assertEquals("Both age and name is invalid", ageCalculation.ageCalculation("",""));

    }

}
