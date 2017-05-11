package abstractfactory;

public class FabricaKraftFoots implements FabricaDeBolachas{

    @Override
    public BolachaRecheada fabricaBolachaRecheada() {
        return new Trakinas();
    }

    @Override
    public BolachaSalgada fabricaBolachaSalgada() {
       return new ClubSocial();
    }

}
