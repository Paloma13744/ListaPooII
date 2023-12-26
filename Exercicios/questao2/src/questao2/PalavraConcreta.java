
package questao2;

/**
 *
 * @author Paloma Nascimento
 */
// Implementação concreta da Palavra
class PalavraConcreta implements Palavra {
    private String texto;

    public PalavraConcreta(String texto) {
        this.texto = texto;
    }

    @Override
    public String render() {
        return texto;
    }

    @Override
    public String text() {
        return texto;
    }
}