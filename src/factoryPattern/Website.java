package factoryPattern;

import java.util.List;

public abstract class Website{
  private final List<Page> pages;

  public Website(List<Page> pages){
    this.pages = pages;
  }

}
