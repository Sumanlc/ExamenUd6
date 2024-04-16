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

    }
    @Test
    public void change4(){

    }
    @Test
    public void change5(){

    }
    @Test
    public void change6(){

    }
    @Test
    public void change7(){

    }
    @Test
    public void change8(){

    }
    @Test
    public void change9(){

    }

}
