package meucci;

public class Main {
    public static void main(String[] args) {
        MioThread t = new MioThread();
        
        t.start();
            for(int i = 0; i<10; i++){
                
                System.out.println("il main dice: " + i);
                if(i == 5){
                    try {
                        t.join();
                    } catch (InterruptedException e) {
                        System.out.println("il thread si è interrotto in modo inaspettato");
                    }
                }       
            }
        
    }
}