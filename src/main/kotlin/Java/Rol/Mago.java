package Java.Rol;

class Mago extends Personaje {
    private Hechizo hechizo;

    public Mago(String nombre) {
        super(nombre, 100, 10);
        this.hechizo = new Hechizo("Fuego", 25);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " lanza un hechizo de " + hechizo.getNombre() + " a " + objetivo.getNombre() + ".");
        objetivo.recibirDanio(hechizo.getPoder());
    }

    public void usarHechizo(Personaje objetivo) {
        System.out.println(nombre + " utiliza el hechizo " + hechizo.getNombre() + " contra " + objetivo.getNombre() + ".");
        objetivo.recibirDanio(hechizo.getPoder());
    }
}