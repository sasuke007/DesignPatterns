package factoryPattern;

import java.util.List;

public class CheckoutPage extends Page{
  private List<String> items;
  private List<String> recommendedItems;

  public CheckoutPage(){
  }

  public CheckoutPage(int fontSize, String color, int length, int width, List<String> items,
      List<String> recommendedItems){
    super(fontSize, color, length, width);
    this.items = items;
    this.recommendedItems = recommendedItems;
  }

  public List<String> getRecommendedItems(){
    return recommendedItems;
  }

  public void setRecommendedItems(List<String> recommendedItems){
    this.recommendedItems = recommendedItems;
  }

  public List<String> getItems(){
    return items;
  }

  public void setItems(List<String> items){
    this.items = items;
  }
}
