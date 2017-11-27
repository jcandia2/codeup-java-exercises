public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools.averageDaysBeforeExpiration = 3;
        BurgerTools.mostPopularTopping = "cheese";
        BurgerTools.temperatureWhenCooked = 145;
        BurgerTools.grill();

        System.out.println(BurgerTools.averageDaysBeforeExpiration);
        System.out.println(BurgerTools.mostPopularTopping);
        System.out.println(BurgerTools.temperatureWhenCooked);

        BurgerTools burger = new BurgerTools();

        burger.nameOfBurger = "the classic";
        burger.numberOfPatties = 1;
        burger.typeOfCheese = "american";



    }
}

