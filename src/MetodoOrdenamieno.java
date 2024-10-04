public class MetodoOrdenamieno {
    public int[] sortBubbleAva(int[] arreglo){
        int n=arreglo.length;
        boolean intercambio=false;
        for(int i=0; i<n; i++){
            intercambio=false;
            System.out.println("Pasada"+i);
            for(int j=0;j<n-1;j++){
                
                System.out.println("j="+j+"[j]="+arreglo[j]+"j+1="+j+1+"[j+1]="+arreglo[j+1]);
                if(arreglo[j]>arreglo[j+1]){
                int aux=arreglo[j];
                arreglo[j]=arreglo[j+1];
                arreglo[j+1]=aux;
                intercambio=true;
            }
            if(intercambio){
                break;
            }
        }
        }
        return arreglo;
    }
    public void prinArreglo(int[] arr){
        for(int num:arr){
            System.out.print(num+"-");
        }
    }
}
