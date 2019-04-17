/* Program Name:Journal  
    Date:2/8/2019    
    Student Name: Aprille Xi
    AP Comp Sci - Section: 8th period 
    Instructor: Mrs. Bhattacharya */
public class Journal extends WrittenItem{
  public Journal(String title, int identificationNum){
    super(title, identificationNum);
  }
  public String toString(){
    return ("Journal- Title: " + this.getTitle() + " ID: " + this.getIdentificationNum());
  }
  public void readJournal(){
    System.out.println("Reading a journal is fun.");
  }
}