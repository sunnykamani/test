package imp1.initialstate;

/*
 * Implement below code WIHOUT changing internal implementation of DinerMenu and PancakeHouseMenu
 */


import java.util.ArrayList;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    // prints ALL menus (both breakfast and lunch)
    public void printMenu() {
        // implement here
        printMenu(pancakeHouseMenu.createIterator());
        printMenu(dinerMenu.createIterator());
    }

    // prints just All menu
    public void printMenu(Iterator iterator) {
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
        // implement here



    // prints all vegetarian menu from both breakfast and lunch
    public void printVegetarianMenu() {
        //implement here
        printVegetarianMenu(pancakeHouseMenu.createIterator());
        printVegetarianMenu(dinerMenu.createIterator());
        }

      private void printVegetarianMenu(Iterator iterator){
          while (iterator.hasNext()){
             MenuItem o = (MenuItem)iterator.next();
          }
      }

    // returns a particular name menu is vegetarian or not
    public boolean isItemVegetarian(String name) {
        //implement here
        printVegetarianMenu(pancakeHouseMenu.createIterator());
        printVegetarianMenu(dinerMenu.createIterator());
        return true;
    }
     private void isVegetarian(Iterator iterator){
         while (iterator.hasNext()){
             System.out.print(iterator.next());
         }
     }

        private void isItemVegetarian(Iterator iterator) {
            while (iterator.hasNext()){
                MenuItem o = (MenuItem)iterator.next();
            }
    }
}