public class Pesce {
    private String colore;
    private double grandezza;

    public Pesce(String colore, double grandezza)throws Exception{
        if(grandezza<=0){
            throw new Exception("pesce inesistente");
        }
        this.colore=colore;
        this.grandezza=grandezza;
    }
    public String getColore(){
        return colore;
    }
    public double getGrandezza(){
        return grandezza;
    }
    public void setGrandezza(double grandezza)throws Exception{
        if(grandezza<=0){
            throw new Exception("pesce inesistente");
        }
        this.grandezza=grandezza;
    }


}
