package factoryPattern;

import java.util.List;

public class ShoppingWebsite extends Website{

  private String userName;


  public ShoppingWebsite(List<Page> pages, String userName){
    super(pages);
    this.userName = userName;
  }


  public static Website getInstance(){
    return new ShoppingWebsite(List.of(new CheckoutPage()), "demo");
  }
}
