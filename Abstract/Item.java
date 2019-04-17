public abstract class Item{
  private int identificationNum;
  private String title;
  
  public Item(String title, int identificationNum){
    this.identificationNum = identificationNum;
    this.title = title;
  }
  public int getIdentificationNum(){
    return identificationNum;
  }
  public String getTitle(){
    return title;
  }
}