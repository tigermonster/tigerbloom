/* Program Name:LibraryMain 
    Date:2/8/2019    
    Student Name: Aprille Xi
    AP Comp Sci - Section: 8th period 
    Instructor: Mrs. Bhattacharya */
public class LibraryMain{
  public static void main(String[] args){
    Item cd = new CD("ThisIsCD", 15520, "Romance");
    Item book = new Book("Harry Potter", 2246);
    Item journal = new Journal("NeoFashion", 444444);
    Item[] list = {cd, book, journal};
    for (int i = 0; i < list.length; i++)
    System.out.println(list[i]);
    ((CD)cd).enterCD();
    ((Book)book).readBook();
  }
}