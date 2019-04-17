/* Program Name:MedialItem  
    Date:2/8/2019    
    Student Name: Aprille Xi
    AP Comp Sci - Section: 8th period 
    Instructor: Mrs. Bhattacharya */
public abstract class MedialItem extends Item{
  private String genre;
  public MedialItem(String title, int identificationNum, String genre){
    super(title, identificationNum);
    this.genre = genre;
  }
  public void watchItem(){
    System.out.println("Wow, I am watching this media electronically!");
  }
  public String getGenre(){
    return genre;
  }
}