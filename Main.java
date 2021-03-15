package m1;

class Main {
    public static void main(String args[]) {

        // NIVELL 1

        // Fase 1
        String nom = "Pol";
        String cognom = "Hernández";
        String cognom2 = "Vila";

        int dia = 2;
        int mes = 8;
        int any = 1994;

        System.out.println(nom + ' ' + cognom + ' ' + cognom2 + '\n' + dia + '/' + mes + '/' + any);

        // Fase 2 i 3
        int anyTraspas = 1948;
        int nAnys = 0;

        System.out.println("Anys de traspàs desde " + anyTraspas + " fins " + any + ": ");
        for(int i = anyTraspas; i <= any; i++){
            if (i % 4 == 0) {
                nAnys++;
                System.out.println(i);
            }
        }

        System.out.println("Número d'anys de traspàs desde " + anyTraspas + " fins " + any + ": " + nAnys);

        // Fase 3
        boolean traspas;
        if (any % 4 == 0) {
            traspas = true;
        } else {
            traspas = false;
        }
        
        String fraseTraspasTrue = "El meu any de naixement és de traspàs.";
        String fraseTraspasFalse = "El meu any de naixement no és de traspàs.";

        if (traspas) {
            System.out.println(fraseTraspasTrue);
        } else {
            System.out.println(fraseTraspasFalse);
        }

        // Fase 4

        String nomicognoms = "El meu nom és " + nom + ' '  + cognom + ' ' + cognom2;
        String data = "Vaig néixer el " + dia + '/' + mes + '/' + any;
        System.out.println(nomicognoms + '\n' + data);
        if (traspas) {
            System.out.println(fraseTraspasTrue);
        } else {
            System.out.println(fraseTraspasFalse);
        }

        // NIVELL 2

        double pi = 3.1416;
        int piInt = (int)pi;
        float piFloat = (float)pi;
        String piString = Double.toString(pi);
        System.out.println(pi);
        System.out.println(piInt);
        System.out.println(piFloat);
        System.out.println(piString);

        // NIVELL 3

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int j = array.length;

        for(int i = 0; i < j; i++) {
            int tmp = array[i];
            array[i] = array[--j];
            array[j] = tmp;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
