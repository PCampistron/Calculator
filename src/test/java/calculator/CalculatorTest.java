package calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    private Calculator monCalculator;

    @BeforeEach
    void setup() { monCalculator = new Calculator(); }
    @AfterEach
    void tearDown() { monCalculator = null; }

    @Test
    void addition() {
        // GIVEN
        int nombre1 = 1;
        int nombre2 = 2;

        // WHEN
        int resultat = monCalculator.add(nombre1, nombre2);

        // THEN
        assertThat(resultat).isEqualTo(3);
    }

    @Test
    void division_resultat_entier() {
        // GIVEN
        int nombre1 = 4;
        int nombre2 = 2;

        // WHEN
        int resultat = monCalculator.divide(nombre1, nombre2);

        // THEN
        assertThat(resultat).isEqualTo(2);
    }

    @Test
    void division_resultat_decimal() {
        // GIVEN
        int nombre1 = 5;
        int nombre2 = 3;

        // WHEN
        int resultat = monCalculator.divide(nombre1, nombre2);

        // THEN
        assertThat(resultat).isEqualTo(2);
    }

    @Test
    void division_par_zero()
    {

    }
}