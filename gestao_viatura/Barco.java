public class Barco extends Viatura {

    private Boolean tempscina=false;

    public Barco() {
        super("barco", 0, 0);
    }

    public Boolean getTempscina() {
        return tempscina;
    }

    public void setTempscina(Boolean tempscina) {
        this.tempscina = tempscina;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Vou mostrar a informação do VIatura =?=");
        System.out.println("Tipo do Barco: " + getTipo());
        System.out.println("Número de rodas: " + getNumRodas());
        System.out.println("VElocidade Máxima: " + getVelMaxima());
        if(tempscina){
            System.out.println("tem pscina:-)");
        } else{
            System.out.println("NÃO tem pscina:-(");
        }
    }
}
