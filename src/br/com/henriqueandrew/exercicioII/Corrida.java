package br.com.henriqueandrew.exercicioII;

// @author Henrique Andrew da Silva
import java.util.ArrayList;
import java.util.Random;

public final class Corrida implements Runnable {

    private Thread competidor;
    private static ArrayList<Piloto> classificacao = new ArrayList<Piloto>();
    private Chegada chegada = new Chegada();
    private static Random random = new Random();

    public Corrida(String nome) {
        competidor = new Thread(this, nome);
        competidor.start();
        System.out.println("Competidor " + nome + " iniciado");
    }

    public Corrida() {
        Corrida.Largada.largada();
    }

    @Override
    public void run() {
        
        int ordem = chegada.ordemDeChegada();
        classificacao.add(new Piloto(competidor.getName(), ordem));
        System.out.println(competidor.getName() + " obteve " + ordem + " pontos");
    }

    private static class Chegada {

        private static int pontuacao = 11;

        private int ordemDeChegada() {
            try {
                
                Thread.sleep(random.nextInt(250));
            } catch (InterruptedException ie) {
                System.err.println("Thread invocado enquanto aguardando, dormindo ou ocupado");
            }
            synchronized (this) {
                return --pontuacao;
            }
        }
    }

    static class Largada {

        public static void largada() {
            System.out.println("Dada a largada da corrida de motos");
            Corrida piloto1 = new Corrida("Piloto 1");
            Corrida piloto2 = new Corrida("Piloto 2");
            Corrida piloto3 = new Corrida("Piloto 3");
            Corrida piloto4 = new Corrida("Piloto 4");
            Corrida piloto5 = new Corrida("Piloto 5");
            Corrida piloto6 = new Corrida("Piloto 6");
            Corrida piloto7 = new Corrida("Piloto 7");
            Corrida piloto8 = new Corrida("Piloto 8");
            Corrida piloto9 = new Corrida("Piloto 9");
            Corrida piloto10 = new Corrida("Piloto 10");
            try {
                piloto1.competidor.join();
                piloto2.competidor.join();
                piloto3.competidor.join();
                piloto4.competidor.join();
                piloto5.competidor.join();
                piloto6.competidor.join();
                piloto7.competidor.join();
                piloto8.competidor.join();
                piloto9.competidor.join();
                piloto10.competidor.join();

                System.out.println(
                        "Corrida encerrada");
                System.out.println(
                        "\n\n===Classificação Final da Corrida===");

            } catch (InterruptedException exc) {
                System.out.println("Corrida interrompida");

            }
        }
    }

    public static ArrayList<Piloto> getClassificacao() {
        return classificacao;
    }

}
