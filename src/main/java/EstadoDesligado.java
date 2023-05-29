public class EstadoDesligado implements  EstadoCarro{
    @Override
    public void acelerar() {
        System.out.println("Não é possível acelerar, carro desligado.");
    }

    @Override
    public void frear() {
        System.out.println("Não é possível frear, carro desligado.");
    }
}
