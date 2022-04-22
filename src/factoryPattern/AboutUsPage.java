package factoryPattern;

public class AboutUsPage extends Page{
  private String authorName;
  private String waterMark;
  private String signature;

  public AboutUsPage(){}

  public AboutUsPage(int fontSize, String color, int length, int width, String authorName, String waterMark,
      String signature){
    super(fontSize, color, length, width);
    this.authorName = authorName;
    this.waterMark = waterMark;
    this.signature = signature;
  }

  public String getAuthorName(){
    return authorName;
  }

  public void setAuthorName(String authorName){
    this.authorName = authorName;
  }

  public String getWaterMark(){
    return waterMark;
  }

  public void setWaterMark(String waterMark){
    this.waterMark = waterMark;
  }

  public String getSignature(){
    return signature;
  }

  public void setSignature(String signature){
    this.signature = signature;
  }
}
