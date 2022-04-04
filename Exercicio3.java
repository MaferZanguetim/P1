public class Exercicio3{
    public static void main(String[] args){
        String produto[] = new String[8];
        produto[0]= "Saca de Soja";
        produto[1]= "Saca de Trigo";
        produto[2]= "Saca de Milho";
        produto[3]= "Saca de Café";
        produto[4]= "Saca de Laranja";
        produto[5]= "Saca de Açucar";
        produto[6]= "Saca de Algodão";
        produto[7]= "Arroba da Carne";


        double estoque[] =new double[10];
        estoque[0]=179.00;
        estoque[1]=1815.00;
        estoque[2]=92.04;
        estoque[3]=1245.32;
        estoque[4]=39.90;
        estoque[5]=139.29;
        estoque[6]=725.14;
        estoque[7]=341.60;

        for(int index = 0; index < produto.length; index++){
            System.out.println( produto[index]+" tem o valor de "+ estoque[index]+ " reais");
        }
    }
}

