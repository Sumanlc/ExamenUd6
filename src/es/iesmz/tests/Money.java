package es.iesmz.tests;

public class Money {
    private static final float EurUsa = 1.18798f;
    private static final float UsdEur = 0.841815f;
    private static final float EurGbp = 0.857839f;
    private static final float GbpEur = 1.165826f;


    public static float change(TipoMoneda origen, TipoMoneda destino, float money){
        if(origen.equals(TipoMoneda.EUR)&& destino.equals(TipoMoneda.USD)){
            money = money * EurUsa;
        }else if(origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.EUR)){
            money = money * UsdEur;
        } else if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.GBP)) {
            money = money * EurGbp;
        }else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.EUR)){
            money = money * GbpEur;
        } else if (origen.equals(destino)) {
            money = -1f;
        } else if (money < 0f) {
            money = -1f;
        }
        return money;
    }


}
