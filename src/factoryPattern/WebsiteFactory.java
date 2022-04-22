package factoryPattern;

import java.util.HashMap;
import java.util.Objects;

public class WebsiteFactory{
  // TODO: so this website factory will return same website object every time.
  // TODO: what if the requirement is that we need to return a new instance of website every time client call the
  //  getWebsite method. How and we implement that.
  //  What will hashmap store in this case.
  private static HashMap<WebsiteType,Website> websites;

  public enum WebsiteType{
    BLOG,
    SHOPPING
  }

  public static Website getWebsite(WebsiteType websiteType){
    if(Objects.isNull(websites)){
      initialize();
    }
    return websites.getOrDefault(websiteType,null);
  }

  public static void initialize(){
    websites.put(WebsiteType.BLOG,BlogWebsite.getInstance());
    websites.put(WebsiteType.SHOPPING,ShoppingWebsite.getInstance());
  }
}
