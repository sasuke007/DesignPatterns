package factoryPattern;

import java.util.List;

public class BlogWebsite extends Website{

  private String userName;

  public BlogWebsite(List<Page> pages, String userName){
    super(pages);
    this.userName = userName;
  }


  public static Website getInstance(){
    return new BlogWebsite(List.of(new AboutUsPage()),"demo");
  }
}
