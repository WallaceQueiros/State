public class Carro {
    private EstadoCarro estado;

    public Carro() {
        estado = new EstadoDesligado();
    }

    public void setEstado(EstadoCarro estado) {
        this.estado = estado;
    }

    public void acelerar() {
        estado.acelerar();
    }

    public void frear() {
        estado.frear();
    }
}
