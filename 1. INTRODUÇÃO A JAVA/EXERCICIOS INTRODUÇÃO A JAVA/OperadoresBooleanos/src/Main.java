public class Main {
    public static void main(String[] args) {

        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "é fim de semana" : "não é fim de semana";
        System.out.println(mensagem);
    }
}