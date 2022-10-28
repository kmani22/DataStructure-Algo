public class Two_Dimensioanal_Operation {

    int arr[][] = null;

    public  Two_Dimensioanal_Operation(int numberOfRows, int numberOfColumns){

        this.arr = new int[numberOfRows][numberOfColumns];

        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j <  arr[0].length ; j++ ){

                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertion(int row, int col, int value) {

        try {

            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("The value is inserted successfully !!");
            }else{
                System.out.println("Cell is already occupied !!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Invalid 2D array index");
        }


        //Time Complexity : 0(1)
        //Space Complexity : 0(1)
        
    }

    public void accessCell(int row, int col) {

        try {

            System.out.print("Element at Row - " + row +  "Column -> " + col + ": ");
            System.out.print(arr[row][col]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Invalid 2D array index !!");
        }

        //Time Complexity : 0(1)
        //Space Complexity : 0(1)
        
    }

    public void traverseArray() {

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        //Time Complexity : 0(n*m)
        //Space Complexity  :o(1) 
    }

    public void SearchElement(int valueToSearch) {

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j ++){
                if(arr[i][j] == valueToSearch){
                    System.out.println("Element found !!");
                    return;
                }
            }
        }

        System.out.println("Element is not present !!");
        //Time Complexity : 0(n*m)
        //Space Complexity  :o(1) 
    }

    public void deleteElement(int row, int col) {

        try {

            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("Element deleted Successfully !!");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Invaid 2D index !!");
        }

        // Time Complexity : 0(1)
        //Space Complexity : o(1)
        
    }
    public static void main(String[] args) {
        
        Two_Dimensioanal_Operation td = new Two_Dimensioanal_Operation(3, 3);
        td.insertion(0, 0,1 );
        td.insertion(0, 1, 10);
        td.insertion(0, 2, 20);
        td.insertion(1, 0, 30);
        td.insertion(1, 1, 40);
        td.insertion(1, 2, 50);

        
        td.deleteElement(5, 0);
        td.traverseArray();

        
    
    }

}
