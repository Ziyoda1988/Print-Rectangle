class Main {
  public static void main(String[] args) {
    //tests
    printRectangle(5, 10, '*');
    printRectangle(10, 3, '$');
    printRectangle(20,20,'#');
   printRectangle(2,10,'x');
  }



  public static void printRectangle(int x, int y, char ch){
       
     for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++){ 

                System.out.print(ch + "");

        }
       System.out.println();
    }
    System.out.println();
  }
     
        //implement here
}
