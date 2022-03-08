package projeto;

public class emprestimo {
 
    public static int getDuasParcelas() {
        return 2;
    }
    public static int getTresParcelas() {
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    }    
    
    public static void calcular (double valor, int parcelas) {
        if(parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("valor final para 2 parcelas : " + valorFinal);
        }
        else if (parcelas == 3) {
            double valorFinal = valor + (valor *getTaxaTresParcelas());
            System.out.println("valor final para 4 parcelas : " + valorFinal);
        }
        else {
            System.out.println("quantidade de parcelas nao aceita");
        }
        
    }







}




