
package br.com;


class Sublinhado extends ModificadorGrafico {
    public Sublinhado(Palavra palavra) {
        super(palavra);
    }

    @Override
    public String render() {
        return "<u>" + palavra.render() + "</u>";
    }

    @Override
    public String text() {
        return palavra.text();
    }
}