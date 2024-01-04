public class Main {
    public static void main(String[] args) {
        int amigo = 4, tronquito = 2, puente = 12, oso;
        char auto = 'w', azul = 'u';
        Integer planeta = 5, nube = 5;
        StringBuilder casa = new StringBuilder("mansion");
        boolean camino = true;


        oso = --amigo;
        System.out.println(oso);

        System.out.println(puente++);
        System.out.println(puente);
        System.out.println(planeta==nube);
        System.out.println(planeta.equals(nube));
        System.out.println(planeta.hashCode());
        System.out.println(nube.hashCode());
        System.out.println((int)auto);
        System.out.println(nube.hashCode() + auto);

        System.out.println(casa.append(camino)); //el metodo append ha modificado a casa
        System.out.println(casa.append(tronquito));

        System.out.println(auto + azul);

        int i , j;

        for(i=0;i<8;i++){
            if(i==5 || i==4){
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }

        i = 0;
        System.out.println("");

        for(;i<8;i++){
            if(i==2 || i==7){
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }

        i = 0;
        System.out.println("");

        bucle1: for(;i<3;i++){
            bucle2: for(j=0;j<11;j++){
                System.out.print(j);
                System.out.print(" ");
                if(j==8 && i==1){
                    break bucle1;
                }
            }
        }

        System.out.println("");

        for(i=0,j=1;j<4;j++){
            i--;
            System.out.print(i + " ");
        }

        System.out.println("");

        i = 0;

        for(;;i++){
            System.out.print(i + " ");
            if(i>10){
                break;
            }
        }
        System.out.println("");

        i = 0;
        bucle3: while(true){
            i++;
            System.out.print(i + " ");
            if(i>7){
                break;
            }
        }
        //System.out.println("Hello world!");
    }
}