public class cruzeiro extends Barco{
    
    private int numero;
    private int pisos;
    private String nomebarcos;
    
    public cruzeiro() {
    this.numero=0;
    this.pisos=0;
    this.nomebarcos= "";
    }

    
    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public int getPisos() {
        return pisos;
    }


    public void setPisos(int pisos) {
        this.pisos = pisos;
    }


    public String getNomebarcos() {
        return nomebarcos;
    }


    public void setNomebarcos(String nomebarcos) {
        this.nomebarcos = nomebarcos;
    }


    public void mostraInfoCruzeiro() {
        super.mostraInfo();
        System.out.println("Vou mostrar a informação do VIatura =?=");
        System.out.println("numero quartos: " + numero );
        System.out.println("Número de pisos: " + pisos );
        System.out.println("nome barco: " + nomebarcos );
    }
}
