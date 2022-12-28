import java.util.ArrayList;
import java.util.List;

public class ExemploColeções {

    public static void main(String args[]) {
        exemploListaSexoMasculino();
        exemploListaSexoFeminino();
    }

    private static void exemploListaSexoFeminino() {
        System.out.println("***** exemploListaSexoFeminino *****");
        List<String> lista = new ArrayList<String>();
        lista.add("Maria José");
        lista.add("Solange Ferreira");
        lista.add("Fernanda dos Santos");
        System.out.println(lista);
        System.out.println("");

    }

    private static void exemploListaSexoMasculino() {
        System.out.println("");
        System.out.println("***** exemploListaSexoMasculino *****");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Isael Teixeira");
        lista.add("Douglas Costa");
        System.out.println(lista);
        System.out.println("");

    }
}
