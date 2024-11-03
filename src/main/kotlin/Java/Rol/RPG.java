package Java.Rol;

public class RPG {
    public static void main(String[] args) {
        Personaje guerrero = new Guerrero("Conan");
        Personaje mago = new Mago("Merlin");

        while (guerrero.estaVivo() && mago.estaVivo()) {
            guerrero.atacar(mago);
            if (mago.estaVivo()) {
                mago.atacar(guerrero);
            }
            System.out.println("-----");
        }

        if (guerrero.estaVivo()) {
            System.out.println(guerrero.getNombre() + " ha ganado!");
        } else {
            System.out.println(mago.getNombre() + " ha ganado!");
        }
    }
}