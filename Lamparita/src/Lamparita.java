public class Lamparita {
    private boolean estado;
    public lamparita(){
        this.estado=false
    }

    public void encender(){
        this.estado=true;
    }

    public void apagar(){
        this.estado=false;
    }

    public boolean estado(){
        return estado;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a programar una lamparita! ");
    }
}
