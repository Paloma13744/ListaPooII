
package questao2;
// Cliente
public class Main {
    public static void main(String[] args) {
        Palavra[] texto = {
                new Negrito(new PalavraConcreta("n")),
                new Italico(new PalavraConcreta("e")),
                new Sublinhado(new PalavraConcreta("g")),
                new Negrito(new Italico(new PalavraConcreta("r"))),
                new Italico(new PalavraConcreta("i")),
                new Negrito(new Italico(new PalavraConcreta("t"))),
                new Italico(new PalavraConcreta("o"))
        };

        // Renderização gráfica
        for (Palavra palavra : texto) {
            System.out.print(palavra.render() + " ");
        }
        System.out.println();

        // Conversão para texto
        for (Palavra palavra : texto) {
            System.out.print(palavra.text() + " ");
        }
    }
}