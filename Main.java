
public class Main {
    public static void main(String[] args) {
        int cantidad;
        int dinero;
        int b500=0;
        int b200=0;
        int b100=0;
        int b50=0;
        int b20=0;
        int b10=0;
        int b5 = 0;
        System.out.println("Dada una cantidad de dinero (múltiplo de 5), desgloso la cantidad de billetes de 500, 200, 100, 50, 20, 10 y 5, con el menor número de billetes");
        do{
            cantidad = Leer.leerEntero("Introduce una cantidad múltiplo de 5: ");
        }while(cantidad%5 != 0);

        dinero = cantidad;

        if (dinero >= 500){
            b500 = dinero/500;
            dinero -= (500*b500);
        }
        if (dinero >= 200){
            b200 = dinero/200;
            dinero -= (200*b200);
        }
        if (dinero >= 100){
            b100 = dinero/100;
            dinero -= (100*b100);
        }
        if (dinero >= 50){
            b50 = dinero/50;
            dinero -= (100*b50);
        }
        if (dinero >= 20){
            b20 = dinero/20;
            dinero -= (100*b20);
        }
        if (dinero >= 10){
            b10 = dinero/10;
            dinero -= (100*b10);
        }
        if (dinero >= 5){
            b5 = dinero/5;
        }
        System.out.println("La cantidad de "+cantidad+" euros, equivale a "+b500+" billetes de 500, "+b200+" billetes de 200, "+b100+" billetes de 100, "+b50+" billetes de 50 ,"+b20+" billetes de 20, "+b10+" billetes de 10 y "+b5+" billetes de 5");
    }
}