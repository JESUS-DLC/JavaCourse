package MultiThreading;

public class DownloadingFile implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading file: "+Thread.currentThread().getName());

        try {
            //duerme el thread para simluar la descarga
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Downloading complete: "+Thread.currentThread().getName());
    }
}
