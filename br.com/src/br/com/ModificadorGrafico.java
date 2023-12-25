
package br.com;

// Decorador base
abstract class ModificadorGrafico implements Palavra {
    protected Palavra palavra;

    public ModificadorGrafico(Palavra palavra) {
        this.palavra = palavra;
    }
}