

package metodos;

import java.util.ArrayList;
import java.util.Random;

public class metodos {
    public ArrayList <Integer> aleatorio = new ArrayList();
    public ArrayList <Integer> ordenado = new ArrayList();
    public ArrayList <Integer> ordemfinal = new ArrayList();
    public Random random = new Random();
    int a = 0;
    private int tbu,cbu;
    private int tse,cse;
    private int tqu,cqu;
    int num = 0;
    public int [] valores;
    
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getTbu() {
        return tbu;
    }

    public void setTbu(int tbu) {
        this.tbu = tbu;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public int getTse() {
        return tse;
    }

    public void setTse(int tse) {
        this.tse = tse;
    }

    public int getCse() {
        return cse;
    }

    public void setCse(int cse) {
        this.cse = cse;
    }

    public int getTqu() {
        return tqu;
    }

    public void setTqu(int tqu) {
        this.tqu = tqu;
    }

    public int getCqu() {
        return cqu;
    }

    public void setCqu(int cqu) {
        this.cqu = cqu;
    }


    
    public void gerador(int num){
    //limpar aleatorio
      if(a == 1){
      
        for(int i=0; i < aleatorio.size();i++){
            aleatorio.removeAll(aleatorio);
      
        }
        a = 0;
      }
      a = 1;
      
    //gerar ordenado
      for(int i =0; i< num; i++){
          ordenado.add(i);
      
      }
    //embaralhar
    int n = 0;
      for(int i = 0; i < num; i++){
      n = ordenado.remove(random.nextInt(ordenado.size()));
      aleatorio.add(n);
      }
      
     Reabastecer();
    }
    
    public void Reabastecer(){
    ordemfinal.removeAll(ordemfinal);
        for(int i=0; i< aleatorio.size();i++){
        ordemfinal.add(aleatorio.get(i));
    
        }
        
    }
    
    
    public String exibirGerados(){
    String ex ="";
        for(int i =0;i<aleatorio.size();i++){
        
        ex+= aleatorio.get(i)+"\n";
        
        }
    return ex;
    }
    
    public String exibirOrdenados(){
    String ex = "";
    for(int i =0;i<ordemfinal.size();i++){
    
        ex+= ordemfinal.get(i)+"\n";
        
    }
    return ex;
    
    
    }
      public void addNoVetor(){
        num = aleatorio.size();
        valores = new int [num];
        int b = 0;
        for(int i = 0; i < num; i++){
            b = aleatorio.get(i);
            valores[i] = b;
        }
    }
    
    public void addNoArray(){
        ordemfinal.removeAll(ordemfinal);
        int b = 0;
        for(int i = 0; i < num; i++){
            b = valores[i];
            ordemfinal.add(b);
        }
    }
    
    public void limparArray(){
    ordemfinal.removeAll(ordemfinal);

    }
    
    
     public void bubble(){
        cbu = 0;
        tbu = 0;
        for(int i = ordemfinal.size()-1; i>=1; i--){
            for(int a = 0; a < i; a++){
                cbu++;
                if(ordemfinal.get(a).compareTo(ordemfinal.get(a+1)) > 0){
                    tbu++;
                    int troca =ordemfinal.get(a);
                    ordemfinal.set(a, ordemfinal.get(a+1));
                    ordemfinal.set(a+1, troca);
                }
            }
        }
    }
    
    
    public void selection(){
        cse = 0;
        tse = 0;
        
        for(int i =0; i< ordemfinal.size()-1;i++){
            int index = i;
            for (int j = i+1 ; j < ordemfinal.size();j++){
                 cse++;
                if(ordemfinal.get(index) > ordemfinal.get(j)){
                index = j;
                }     
            }
            if(index != i ){
            tse++;
            int troca = ordemfinal.get(i);
            ordemfinal.set(i,ordemfinal.get(index));
            ordemfinal.set(index,troca);
            }     
        }
    }
     public void ordenarVetorDeInteiros(int[] vetor) {
        QuickSort(vetor, 0, vetor.length - 1);
    }
    
    private void QuickSort(int[] vetor, int inicio, int fim) {
        if(fim > inicio) {
            
            int indexPivo = dividir(vetor, inicio, fim);
            QuickSort(vetor, inicio, indexPivo - 1);
            QuickSort(vetor, indexPivo + 1, fim);
        }
    }
     
    private int dividir(int[] vetor, int inicio, int fim) {
    int pivo, pontEsq, pontDir = fim;
    pontEsq = inicio + 1;
    pivo = vetor[inicio];

    while(pontEsq <= pontDir) {
      while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
        pontEsq++;
        cqu++;
      }

      while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
        pontDir--;
        cqu++;
      }

      if(pontEsq < pontDir) {
        cqu++;
        trocar(vetor, pontDir, pontEsq);
        pontEsq++;
        pontDir--;
        
      }
    }

    trocar(vetor, inicio, pontDir);
    return pontDir;
  }
    
    private void trocar(int[] vetor, int i, int j) {
        tqu++;
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
  }
    
   
}
