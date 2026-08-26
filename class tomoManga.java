class tomoManga{
String titularObra;
int numeroVolumen;
double precioCompra;
boolean leido;

public tomoManga(String titularObra, int numeroVolumen, double precioCompra, boolean leido){
    this.titularObra = titularObra;

    if(numeroVolumen < 0){
        this.numeroVolumen = 0;
    }else{
        this.numeroVolumen = numeroVolumen;
    }

if(precioCompra < 0){
    this.precioCompra = 0.0;
}else{
    this.precioCompra = precioCompra;
}

this.leido = false;
}

void marcarComoLeido(){
this.leido = true;
System.out.println("Manga leido");
}

  

void mostrarDatos(){
    System.out.println("--------------------------------------------------------");
    System.out.println("Titulo: " + titularObra);
    System.out.println("Volumen: " + numeroVolumen);
    System.out.println("Precio: " + precioCompra);
    System.out.println("Estado: " + (this.leido ? "Leído" : "Pendiente de lectura"));
    System.out.println("--------------------------------------------------------");
}


public static void main(String[] args) {
    tomoManga m1 = new tomoManga("Chainsaw Man", 3, 15, false);

System.out.println("Estado inicial");

m1.mostrarDatos();
m1.marcarComoLeido();

System.out.println("Estado despues de la lectura");
m1.mostrarDatos();


}
}