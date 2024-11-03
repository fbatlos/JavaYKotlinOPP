package Java.Rol;

abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected int poderAtaque;

    public Personaje(String nombre, int puntosDeVida, int poderAtaque) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.poderAtaque = poderAtaque;
    }

    public abstract void atacar(Personaje objetivo);

    public void recibirDanio(int danio) {
        this.puntosDeVida -= danio;
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
        System.out.println(nombre + " recibe " + danio + " puntos de daño. Vida restante: " + puntosDeVida);
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}