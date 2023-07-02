import java.util.Random;

class Tarea extends Thread {
    private int porcentaje;

    public void run() {
        for (int i = 0; i <= 100; i += 10) {
            porcentaje = i;
            trabajar();
        }
    }

    public void trabajar() {
        Random random = new Random();
        int tiempo = random.nextInt(500) + 100; // Tiempo aleatorio entre 100 y 600 milisegundos

        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getPorcentaje() {
        return porcentaje;
    }
}
