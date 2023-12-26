package questao3;

/**
 *
 * @author Paloma Nascimento
 */
public class Main {

    public static void main(String[] args) {
        // Criando o ataque básico
        Ataque ataque = new AtaqueBasico();

        // Adicionando poderes dinamicamente
        Poder ataqueComPoder = new PoderFogo(new PoderGelo(new PoderTrovoada(ataque)));

        // Executando o ataque decorado
        ataqueComPoder.executarAtaque();

        // Habilitando os poderes
        if (ataqueComPoder instanceof PoderFogo) {
            ((PoderFogo) ataqueComPoder).habilitar();
        }

        if (ataqueComPoder instanceof PoderGelo) {
            ((PoderGelo) ataqueComPoder).habilitar();
        }

        if (ataqueComPoder instanceof PoderTrovoada) {
            ((PoderTrovoada) ataqueComPoder).habilitar();
        }
    }
}
