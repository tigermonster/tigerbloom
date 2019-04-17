/* Program Name:CD 
    Date:2/8/2019    
    Student Name: Aprille Xi
    AP Comp Sci - Section: 8th period 
    Instructor: Mrs. Bhattacharya */
public class CD extends MedialItem{
  public CD(String title, int identificationNum, String genre){
    super(title, identificationNum, genre);
  }
  public void enterCD(){
    System.out.println("You have entered the CD");
    super.watchItem();
  }
  public String toString(){
    return ("CD- Title: " + this.getTitle() + " ID: " + this.getIdentificationNum() + " Genre: " + this.getGenre());
  }
}