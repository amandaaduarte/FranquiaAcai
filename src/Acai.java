public class Acai {
    public String tamanho;
    public Double valor;
    public Boolean acrescimoDeSorvete;

    public Double CalcularValor(Boolean acrescimoDeSorvete, String tamanho){
        if (tamanho.equals("p")){
            valor = 8.0;

        }else if (tamanho.equals("M")){
            valor = 10.0;

        }else{
            valor = 12.0;
        }

        if (acrescimoDeSorvete){
            valor += 2.0;
        }
        return valor;
    }


}
