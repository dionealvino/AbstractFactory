package abstractfactory;

public class FabricaMarilian implements FabricaDeBolachas{

    @Override
    public BolachaRecheada fabricaBolachaRecheada() {
        return new Wafer();
    }

    @Override
    public BolachaSalgada fabricaBolachaSalgada() {
        return new PitStop();
    }
    
}
