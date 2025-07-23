package CheeseRace.GameDesign;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Design {



    /**
     * method "Intro()" da classe Design imprime a introdução do game na consola.
     */
    public static void Intro() {

        try {
            System.out.println("\n");

            //imprime o desenho do rato.
            BufferedReader reader = new BufferedReader(new FileReader("rato.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            System.out.println();

            //imprime "Cheese".
            reader = new BufferedReader(new FileReader("cheese.txt"));
            System.out.println("\u001B[33m"); //ativa cor amarela.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\u001B[0m"); //reseta a cor.
            reader.close();

            //imprime "Race"
            reader = new BufferedReader(new FileReader("race.txt"));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        //créditos
        Text.ShortCredits();
    }


    /**
     * method "Bar()" imprime uma barra na consola.
     */
    public static void Bar() {
        System.out.println("\u001B[33m" + "──── ୨୧ ────".repeat(12) + "\u001B[0m");

    }


    /**
     * method "Bye()" imprime um rato indo embora.
     * @throws IOException
     */
    public static void Bye() throws IOException {

        //imprime o desenho do rato.
        BufferedReader reader = new BufferedReader(new FileReader("bye.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

    }


    /**
     * method "SwissCheese()" imprime um queijo suíço.
     */
    public static void SwissCheese() {

        try {
            System.out.println("\n");
            BufferedReader reader = new BufferedReader(new FileReader("credits2.txt"));
            String line;
            System.out.println("\u001B[33m"); //ativa cor amarela.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\u001B[0m"); //reseta a cor.
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }


    /**
     * method "Racers" imprime a imagem de dois ratos em um veículo.
     */
    public static void Racers() {

        try {
            System.out.println("\n");
            BufferedReader reader = new BufferedReader(new FileReader("racers.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }



    /**
     * method prints an image of the new pilot created
     */
    public static void NewPilot() {

        try {
            System.out.println("\n");
            BufferedReader reader = new BufferedReader(new FileReader("new_pilot.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }



    /**
     * method prints an image of Bobbie and Jimmy finding the special bounty known as "cheese pieces"
     */
    public static void Bounty() {

        try {
            System.out.println("\n");
            BufferedReader reader = new BufferedReader(new FileReader("bounty.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }


    /**
     * method prints this image everytime players earn cheese pieces.
     */
    public static void Earn() {

        try {
            System.out.println("\n");
            BufferedReader reader = new BufferedReader(new FileReader("earn.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }


    /**
     * method prints this image of Mozzorato when you visit the mechanic shop
     */
    public static void Mozzorato() {

        try {
            System.out.println("\n");
            BufferedReader reader = new BufferedReader(new FileReader("mechanic_shop.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }


    /**
     * method prints an image of the new vehicle acquired
     */
    public static void newVehicle() {

        try {
            System.out.println("\n");
            BufferedReader reader = new BufferedReader(new FileReader("new_vehicle.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }


    /**
     * method prints an image of the current amount of cheese
     */
    public static void yummy() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("yummy.txt"));
            String line;
            System.out.println("\u001B[33m"); //ativa cor amarela.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\u001B[0m"); //reseta a cor.
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }


    /**
     * method prints an image of a gem every time the stock of Race Items is opened
     */
    public static void gem() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("gem.txt"));
            String line;
            System.out.println("\u001B[33m"); //ativa cor amarela.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\u001B[0m"); //reseta a cor.
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    /**
     * method prints an image of a gem every time the stock of Race Items is opened
     */
    public static void raceCar() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("chosen_track_image.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    /**
     * method prints the image of a rat prepared to race right before choosing a track
     */
    public static void prepareToRace() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("prepared_rat.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    /**
     * method prints the image of a tool box every time the user is asked if he wants to visit the mechanic shop.
     */
    public static void toolBox() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("tool_box.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }


    /**
     * method prints the image of a big rat in the end of the game
     */
    public static void imageFinal() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("final.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

}
