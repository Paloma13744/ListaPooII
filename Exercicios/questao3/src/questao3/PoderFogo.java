
package questao3;

/**
 *
 * @author Paloma Nascimento
 */

// Implementação concreta de um poder adicional
class PoderFogo implements Poder {
    private Ataque ataqueDecorado;

    public Ataque getAtaqueDecorado() {
        return ataqueDecorado;
    }

    public void setAtaqueDecorado(Ataque ataqueDecorado) {
        this.ataqueDecorado = ataqueDecorado;
    }
    

    public PoderFogo(Ataque ataqueDecorado) {
        this.ataqueDecorado = ataqueDecorado;
    }

    @Override
    public void executarAtaque() {
        ataqueDecorado.executarAtaque();
        System.out.println("Ataque de Fogo!");
    }

    @Override
    public void habilitar() {
        System.out.println("Poder de Fogo Habilitado!");
    }
}