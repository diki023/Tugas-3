package Tugass3;

class Armor {
    String name;
    double defencePower;

    Armor(String name, double defencePower){
        this.defencePower = defencePower;
        this.name = name;
    }

    void display(){
        System.out.println("Armor: " + this.name + ", Defence: " + this.defencePower);
    }
}
