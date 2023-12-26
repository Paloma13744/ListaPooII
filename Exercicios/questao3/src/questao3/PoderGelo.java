package questao3;

/**
 *
 * @author Paloma Nascimento
 */
// Implementação concreta de outro poder adicional
class PoderGelo implements Poder {

    private Ataque ataqueDecorado;

    public Ataque getAtaqueDecorado() {
        return ataqueDecorado;
    }

    public void setAtaqueDecorado(Ataque ataqueDecorado) {
        this.ataqueDecorado = ataqueDecorado;
    }

    public PoderGelo(Ataque ataqueDecorado) {
        this.ataqueDecorado = ataqueDecorado;
    }

    @Override
    public void executarAtaque() {
        ataqueDecorado.executarAtaque();
        System.out.println("Ataque de Gelo!");
    }

    @Override
    public void habilitar() {
        System.out.println("Poder de Gelo Habilitado!");
    }
}
