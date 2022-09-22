import java.util.Scanner;
public class Palitos {

public static void main(String[] args) {
// TODO Auto-generated method stub



int NumPalitos = 21;

for(int i=0; i<= 21; i++)
{
  System.out.println(i);
}



do {


System.out.println("El numero de palitos es: "+NumPalitos);
//Entrada por teclado
System.out.println("Indica cuantos quitas: ");
Scanner reader = new Scanner(System.in);
int resta = reader.nextInt();



if (resta >=1 && resta<=4) {

NumPalitos -= resta;

System.out.println(NumPalitos);


}else {
System.out.println("mete un numero valido");
}


int ia;

ia = resta-5;

ia=ia*-1;

if(ia==0) {
ia=ia+5;

}


if(NumPalitos>0) {
System.out.println("la ia ha quitado: "+ia);
NumPalitos=NumPalitos-ia;
}





}while (NumPalitos>1);


System.out.println("Solo queda: "+NumPalitos + " perdiste");
}
}

