package builderPattern;

public class SubwayBurger{
  private String bread;
  private String cheese;
  private String patty;
  private String sauce;
  private String veggies;

  public static SubwayBurgerBuilder builder(){
    return new SubwayBurgerBuilder();
  }

  public static class SubwayBurgerBuilder{
    private String bread;
    private String cheese;
    private String patty;
    private String sauce;
    private String veggies;

    public SubwayBurgerBuilder setBread(String bread){
      this.bread = bread;
      return this;
    }

    public SubwayBurgerBuilder setCheese(String cheese){
      this.cheese = cheese;
      return this;
    }

    public SubwayBurgerBuilder setPatty(String patty){
      this.patty = patty;
      return this;
    }

    public SubwayBurgerBuilder setSauce(String sauce){
      this.sauce = sauce;
      return this;
    }

    public SubwayBurgerBuilder setVeggies(String veggies){
      this.veggies = veggies;
      return this;
    }

    public SubwayBurger build(){
      SubwayBurger subwayBurger = new SubwayBurger();
      subwayBurger.bread=this.bread;
      subwayBurger.cheese=this.cheese;
      subwayBurger.patty=this.patty;
      subwayBurger.sauce=this.sauce;
      subwayBurger.veggies=this.veggies;
      return subwayBurger;
    }
  }
}
