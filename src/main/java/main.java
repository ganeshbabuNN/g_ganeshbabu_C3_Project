import java.time.LocalTime;

class main{
	public static void main(String[] args) throws restaurantNotFoundException {
		Restaurant restaurant = new Restaurant("Amelie's cafe","Chennai",LocalTime.parse("10:30:00"),LocalTime.parse("22:00:00"));
		restaurant.addToMenu("Sweet corn soup",119);
		restaurant.addToMenu("Vegetable lasagne",269);
		System.out.println(restaurant.getMenu());
		System.out.println("Status :" + restaurant.isRestaurantOpen());

		RestaurantService restaurantService= new RestaurantService();
		restaurantService.addRestaurant("Amelie's cafe","Chennai",LocalTime.parse("10:30:00"),LocalTime.parse("22:00:00"));
		restaurant=restaurantService.findRestaurantByName("Amelie's cafe");
		System.out.println("Finding the restaurant by Name:" + restaurant.getName());
	}
}