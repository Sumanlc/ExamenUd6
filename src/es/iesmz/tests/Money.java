package es.iesmz.tests;

public class Money {
    private static final float EurUsd = 1.18798f;
    private static final float UsdEur = 0.841815f;
    private static final float EurGbp = 0.857839f;
    private static final float GbpEur = 1.165826f;


    public static float change(TipoMoneda origen, TipoMoneda destino, float money){
        if(origen.equals(TipoMoneda.EUR)&& destino.equals(TipoMoneda.USD)){
            money = money * EurUsd;
        }else if(origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.EUR)){
            money = money * UsdEur;
        } else if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.GBP)) {
            money = money * EurGbp;
        }else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.EUR)){
            money = money * GbpEur;
        }else if(origen.equals(TipoMoneda.USD)&& destino.equals(TipoMoneda.GBP)){
            money= money * UsdEur;
            money = money * EurGbp;
        }else if(origen.equals(TipoMoneda.GBP)&& destino.equals(TipoMoneda.USD)){
            money=money * GbpEur;
            money=money * EurUsd;
        } else if (origen.equals(TipoMoneda.PTS)&& destino.equals(TipoMoneda.EUR)){
            money = -1f;
        }else if(origen.equals(TipoMoneda.EUR)&& destino.equals(TipoMoneda.PTS)){
            money = -1f;
        }
        if (money <= 0f) {
            money = -1f;
        }
        return money;
    }



}
