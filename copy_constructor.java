class food {
    String food_name;
    food(String name){
        this.food_name=name;
        // food_name="mali chaap";
        System.out.println(food_name);

    }
    food( food ref){
        food_name=ref.food_name;
        System.out.println(food_name);
    }

}


public class copy_constructor {
    public static void main(String[] args) {
        food mali = new food("mali chaap");
        @SuppressWarnings("unused")
        food ras = new food(mali);
    }
    
}
