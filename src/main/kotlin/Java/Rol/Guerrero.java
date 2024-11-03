package Java.Rol;

class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre, 150, 20);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca a " + objetivo.getNombre() + " con espada.");
        objetivo.recibirDanio(poderAtaque);
    }
}