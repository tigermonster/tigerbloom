/* Program Name:WrittenItem  
    Date:2/8/2019    
    Student Name: Aprille Xi
    AP Comp Sci - Section: 8th period 
    Instructor: Mrs. Bhattacharya */
public abstract class WrittenItem extends Item{
  public WrittenItem(String title, int identificationNum){
    super(title, identificationNum);
  }
  public void readItem(){
    System.out.println("Wow, I am reading and it's pretty interesting!");
  }
}
  