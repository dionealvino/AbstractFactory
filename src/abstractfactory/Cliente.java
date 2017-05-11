package abstractfactory;

public class Cliente {

    public static void main(String[] args) {
        
        System.out.println("Fabrica KraftFoots");
        FabricaDeBolachas fabrica = new FabricaKraftFoots();
        BolachaRecheada recheada = fabrica.fabricaBolachaRecheada();
        BolachaSalgada salgada = fabrica.fabricaBolachaSalgada();
        recheada.exibirInfoNutricional();
        salgada.exibirInfoNutricional();
        
        System.out.println("Fabrica Marilian");
        fabrica = new FabricaMarilian();
        recheada = fabrica.fabricaBolachaRecheada();
        salgada = fabrica.fabricaBolachaSalgada();
        recheada.exibirInfoNutricional();
        salgada.exibirInfoNutricional();
             
    }
    
}
