/* Program Name:Book 
    Date:2/8/2019    
    Student Name: Aprille Xi
    AP Comp Sci - Section: 8th period 
    Instructor: Mrs. Bhattacharya */
public class Book extends WrittenItem{
  public Book(String title, int identificationNum){
    super(title, identificationNum);
  }
  public String toString(){
    return ("Book- Title: " + this.getTitle() + " ID: " + this.getIdentificationNum());
  }
  public void readBook(){
    System.out.println("This book is pretty good.");
  }
}