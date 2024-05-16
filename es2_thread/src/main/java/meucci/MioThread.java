package meucci;

public class MioThread extends Thread {

    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("il thread dice: " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                
            }
        }
    }
}
