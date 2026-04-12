package aulas;

public class ufrpearray {

    public static void main(String[] args) {

        //definição / inicialização

        int[] valores = new int[10]; //definição + inicialização

        valores[0] = -89;
        valores[1] = 155;

        for(int i = 0; i < valores.length;i++ ){
            System.out.println(valores[i]);
        }
for (int i = 0; i< valores.length;i++){
    valores[i] = 2 * i;
    System.out.println(valores[i]);
}
int[] valoresturbo = {234,2434,2214,1224};
for(int i = 0; i < valoresturbo.length;i = i + 2){
    System.out.println(valoresturbo[i]);
}

String[] tratament = new String[10];
String[] tratamento = {
        "Sr",
        "Sra",
        "Vossa excelencia"
};
        System.out.println(tratamento[2] + " Fulana, bem vinda!");

        int[][] arraybidimensional = new int[10][5];
        arraybidimensional[0] = new int[]{0,1,2,3,4,5,6,7,8,9};
        arraybidimensional[1] = new int[]{0,1,2,3};
    }
}
