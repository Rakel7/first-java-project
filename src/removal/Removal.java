package removal;
import java.util.Scanner;

public class Removal {
    private String nom; // attributs
    private int capCamion;

    public Removal(String nom) { // constructeur
        this.nom = nom;
        this.capCamion = capCamion;
    }
    public void auTravail(){
        int noVoyage = 0;
        int nbCartons = 0;
        int capCamion = 0;


        System.out.println(nom);
        Scanner clavier = new Scanner(System.in);


        System.out.print("Capacity of truk  ? : ");
        capCamion = clavier.nextInt();

        System.out.print("How much box ? : ");
        nbCartons = clavier.nextInt();

        clavier.close();

        int emport = capCamion;

        System.out.println("Start travel");
        System.out.println("\nnoVoyage\t nbCartons\t emport\t capCamion\t");
        for(int rest = nbCartons; rest > 0; rest -= capCamion){
            noVoyage++;
            if (rest < capCamion){
                emport = rest;
            }
            System.out.print(noVoyage + "\t\t\t\t" + rest + "\t\t\t" + emport + "\t\t" + capCamion + "\t\n");
        }
        System.out.println("\nEnd");

    }

}