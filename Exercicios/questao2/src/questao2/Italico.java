
package questao2;

class Italico extends ModificadorGrafico {
    public Italico(Palavra palavra) {
        super(palavra);
    }

    @Override
    public String render() {
        return "<i>" + palavra.render() + "</i>";
    }

    @Override
    public String text() {
        return palavra.text();
    }
}