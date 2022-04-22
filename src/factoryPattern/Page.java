package factoryPattern;

public abstract class Page{

  private int fontSize;
  private String color;

  public Page(){
  }

  private int length;
  private int width;

  public Page(int fontSize, String color, int length, int width){
    this.fontSize = fontSize;
    this.color = color;
    this.length = length;
    this.width = width;
  }

  public int getFontSize(){
    return fontSize;
  }

  public void setFontSize(int fontSize){
    this.fontSize = fontSize;
  }

  public String getColor(){
    return color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public int getLength(){
    return length;
  }

  public void setLength(int length){
    this.length = length;
  }

  public int getWidth(){
    return width;
  }

  public void setWidth(int width){
    this.width = width;
  }
}
