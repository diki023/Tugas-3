package Tugass3;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Ucup", 100);
        Player player2 = new Player("Tatang", 50);


        Weapon pedang = new Weapon("Pedang", 15);
        Weapon ketapel = new Weapon("Ketapel", 1);


        Armor bajuBesi = new Armor("Baju Besi", 10);
        Armor kaos = new Armor("Kaos", 0);


        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();


        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();
    }
}
