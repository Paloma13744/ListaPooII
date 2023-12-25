
package br.com;
// Decoradores específicos
class Negrito extends ModificadorGrafico {
    public Negrito(Palavra palavra) {
        super(palavra);
    }

    @Override
    public String render() {
        return "<b>" + palavra.render() + "</b>";
    }

    @Override
    public String text() {
        return palavra.text();
    }
}