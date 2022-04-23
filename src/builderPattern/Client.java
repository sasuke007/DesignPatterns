package builderPattern;

public class Client{
  // now the subway burger object in immutable.
  // same as string class in java.
  SubwayBurger subwayBurger = SubwayBurger.builder().setBread("wheat").setCheese("mozzarella").setPatty("italian " +
      "brown patty").setSauce("tomato sauce").setVeggies("capsicum").build();
}
