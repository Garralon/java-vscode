package model;




public class person {
    private String nombre;
    public Float peso;
    public Float altura;



    public person(){ 
        nombre="Desconocido";
        peso= 70f;
        altura= 170;
    }   
    
    public person(String nombre, Float peso, Float altura){

        this.nombre=nombre;
        this.peso=peso;
        this.altura=altura;

    }



    public String getNombre(){
        return nombre;
    }
   
    
    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    public Float getAltura() {
        return altura;
    }
    public void setAltura(Float altura) {
        this.altura = altura;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

}
