package s7_proyectomatrices_andresmejia;

import static s7_proyectomatrices_andresmejia.S7_ProyectoMatrices_AndresMejia.random;


public class MetodosMatrices {
    
    private int [][]Matriz;
    private String Mensaje;
    
    public MetodosMatrices(){
        
        
    }
    public int [][] getMatriz(){
        return Matriz;
        
    }
    
    public String getMensaje(){
        return Mensaje;
        
    }
    
    public void setMatriz(int [][] Matriz){
        this.Matriz=Matriz;
    }
    
    public void setMensaje(String Mensaje){
        this.Mensaje=Mensaje;
    }
    
    public int [][] lectura(int filas, int columnas){
        int [][] temporal=new int[filas][columnas];
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                temporal[i][j]=random.nextInt(10);
            }
        }
        return temporal;
    } //Fin de lectura
    
    public String print(int [][] array){
        String acum="";
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                acum+="["+array[i][j]+"]"+" ";
            }
            acum+="\n";
        }
        return acum;
    } //Fin de print
    
    
    public static int sumasimple(int [][] array){
        int suma=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                suma=array[i][j]+suma;
            }
            
        }
        return suma;
    }
    
    public int mayor(int[][]array){
        int mayor=-1;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length;j++){
                if(array[i][j]>mayor){
                    mayor=array[i][j];
                }
            }
        }
        
        return mayor;
    } //Fin mayor
    
    public int [][] sumaparalelo(int[][]array1, int[][]array2){
        int [][]temporal=new int [array1.length][array1[0].length];
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                temporal[i][j]=array1[i][j]+array2[i][j];
            }
        }
        
        return temporal;
    } //Fin suma paralelo
    
    public int sumadiagonal(int[][]array){
        int suma=0;
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length; j++){
                if(i==j){
                    suma=array[i][j]+suma;
                }
            }
        }
        return suma;
    } //Fin diagonal
    
    public int sumadiagonal2(int [][]array){
        int suma=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length;j++){
                if(i+j==array.length-1){
                    suma=array[i][j]+suma;
                }
            }
        }
        return suma;
    } //Fin segunda diagonal 
    
    public int triangulosup(int [][]array){
        int suma=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(j>i){
                    suma=array[i][j]+suma;
                }
            }
        }
        return suma;
    }
    
    public int trianguloinf(int [][]array){
        int suma=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length;j++){
                if(j<i){
                    suma=array[i][j]+suma;
                }
            }
        }
        return suma;
    }
    
    public int [] sumafilas(int [][]array){
        int temporal []=new int [array.length];
        int suma;
        for(int i=0; i<array.length; i++){
            suma=0;
            for(int j=0; j<array[i].length; j++){
                suma=array[i][j]+suma;
            }
            temporal[i]=suma;
        }
        return temporal;
    } //Fin suma filas
    
    public String printarr(int [] array){
        String acum="";
        for(int i=0; i<array.length; i++){
            acum+="["+array[i]+"]"+" \n";
        }
        
        return acum;
    } //Fin printarr
    
    public String printarrv(int [] array){
        String acum="";
        for(int i=0; i<array.length; i++){
            acum+="["+array[i]+"]"+" ";
        }
        
        return acum;
    } //Fin printarr
    
    
    public int [] sumacolumnas(int [][] array){
        int filas=array.length;
        int columnas=array[0].length;
        int []temporal=new int[array[0].length];
        int sum;
        for(int i=0; i<columnas;i++){
            sum=0;
            for(int j=0; j<filas; j++){
                sum=array[j][i]+sum;
            }
            temporal[i]=sum;
        }
        
        return temporal;        
    } //Fin suma columnas
    
    
    public int [][] matrizceros(int [][]array){
        int temporal[][]=new int [array.length][array[0].length];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(i==0 || j==0||j==array[i].length-1 || i==array.length-1){
                    temporal[i][j]=0;
                }
                else {
                    temporal[i][j]=array[i][j];
                }
            }
        }
        return temporal;
    } //Fin matriz ceros
    
    public int [][] orden(int [][]array){
        int [][] temporal= new int[array.length][array[0].length];
        int [] ordenado=new int[array.length*array[0].length];
        int contador=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                ordenado[contador]=array[i][j];
                contador++;
            }
        }
        ordenado=ascendiente(ordenado);
        contador=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length;j++){
                temporal[i][j]=ordenado[contador];
                contador++;
            }
        }
        return temporal;
    }
    
    public int [] ascendiente(int [] arreglado){
        //Dos fors que recorren la palabra para ver cada numero
        for(int i=0; i<arreglado.length; i++){
            for(int j=i; j<arreglado.length; j++){
                // Este va a verificar si el numero original es mayor al siguiente
                if(arreglado[i]>arreglado[j]){
                    //Si es mayor entonces va a swap
                    int swap=arreglado[i];
                    arreglado[i]=arreglado[j];
                    arreglado[j]=swap;
                } 
            }
        }
        return arreglado;
    } //Fin ascendiente
    
    public int [][] multmatrix(int [][] array1, int[][]array2){
        int temporal [][]=new int [array1.length][array2[0].length];
        int suma=0;
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2[0].length;j++){
                suma=0;
                for(int x=0; x<array1[0].length;x++){
                    suma=suma+array1[i][x]*array2[x][j];
                }
                temporal[i][j]=suma;
            }
        }
        return temporal;
    } //Fin multiplicacion matriz 
    
} //Fin de la clase
