package questao3;

/**
 *
 * @author Paloma Nascimento
 */
// Implementação concreta de mais um poder adicional
class PoderTrovoada implements Poder {

    private Ataque ataqueDecorado;

    public Ataque getAtaqueDecorado() {
        return ataqueDecorado;
    }

    public void setAtaqueDecorado(Ataque ataqueDecorado) {
        this.ataqueDecorado = ataqueDecorado;
    }

    public PoderTrovoada(Ataque ataqueDecorado) {
        this.ataqueDecorado = ataqueDecorado;
    }

    @Override
    public void executarAtaque() {
        ataqueDecorado.executarAtaque();
        System.out.println("Ataque de Trovoada!");
    }

    @Override
    public void habilitar() {
        System.out.println("Poder de Trovoada Habilitado!");
    }
}
