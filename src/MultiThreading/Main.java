package MultiThreading;

public class Main {
    public static void main(String[] args) {
        //NUMERO ACTUAL DE THREAD
        //System.out.println(Thread.activeCount());
        //NUMERO DISPONILBE DE THREAD
        //System.out.println(Runtime.getRuntime().availableProcessors());
        //NOMBRE DEL THREAD PRINCIPAL
        //System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread(new DownloadingFile());
        thread.start();

        try {
            //el thread principal espera a que termine el otro thread para continuar
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("file can be scanned");

    }
}
