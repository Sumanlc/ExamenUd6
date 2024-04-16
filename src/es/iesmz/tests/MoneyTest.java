package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    public void change1(){
        Money m1 = new Money();
        assertEquals(28.37f,Money.change(TipoMoneda.EUR,TipoMoneda.USD,23.88f),0.01f);
    }
    @Test
    public void change2(){
        Money m2 = new Money();
        assertEquals(1165.83f,Money.change(TipoMoneda.GBP,TipoMoneda.EUR, 1000.0f),0.01f);
    }
    @Test
    public void change3(){
        Money m3 = new Money();
        assertEquals(201.21f,Money.change(TipoMoneda.EUR,TipoMoneda.GBP, 234.56f),0.01f);
    }
    @Test
    public void change4(){
        Money m4 = new Money();
        assertEquals(37.51f,Money.change(TipoMoneda.USD,TipoMoneda.EUR, 44.56f),0.01f);
    }
    @Test
    public void change5(){
        Money m5 = new Money();
        assertEquals(138.49f,Money.change(TipoMoneda.GBP,TipoMoneda.USD, 100.0f),0.01f);
    }
    @Test
    public void change6(){
        Money m6 = new Money();
        assertEquals(722.14f,Money.change(TipoMoneda.USD,TipoMoneda.GBP, 1000.0f),0.01f);
    }
    @Test
    public void change7(){
        Money m7 = new Money();
        assertEquals(-1f,Money.change(TipoMoneda.PTS,TipoMoneda.EUR, 100.0f), 0.01f);
    }
    @Test
    public void change8(){
        Money m8 = new Money();
        assertEquals(-1f,Money.change(TipoMoneda.EUR,TipoMoneda.PTS,123.3f),0.01f);
    }
    @Test
    public void change9(){
        Money m9 = new Money();
        assertEquals(-1f,Money.change(TipoMoneda.USD,TipoMoneda.EUR,-167.34f),0.01f);
    }

}
