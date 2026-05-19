// Rhombus Pattern
 class RhombusPattern {
    public static void main(String[] args){
        int n = 5;
        for(int i = 1 ; i<= n;i++){
            // Space Printing (1 --> n-row number)
            for(int j = 1 ;j <=n-i;j++){
                System.out.print(" ");
            }
            // Star Printing (1 --> n number of stars )
            for(int k=1;k<=n;k++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}

// Inverted Half Pyramid Pattern
class InvertedPattern {
    public static void main(String[] args) {
        int n = 5;
        //First for Loop for Rows
        for( int i = 1 ; i<=n ;i++){
            //Second for Loop for Colums (1 --> n-i+1)
            for(int j = 1; j<= n-i+1 ;j++){
                System.out.print("* ");
            }
            //New Line
            System.out.println();
        }
    }
}

// Solid Pyramid Pattern
class SolidPyramid{
    public static void main(String[] args){
        int n = 5;
        // Rows Outer Loop( 1 --> n)
        for( int i = 1; i<=n ; i++){
            //Space Printing ( 1 --> n-i)
            for(int j = 1; j <= n-i ; j++){ 
                System.out.print("  ");
            }
            //Star Printing ( 1 --> 2*i-1)
            for(int k = 1; k<=2*i-1 ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Inverted Solid Pyramid
class InvertedSolidPyramid{
    int n = 4 ;
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1 ; i<=n ; i++){
            
           for( int j =1 ;j <= i-1 ; j++){
            System.out.print("  ");
           }
           for(int k = 1 ;k<= 2*n-2*i+1 ;k++){
            System.out.print("* ");
           }
           System.out.println();
        }
    }
}

//Hollow Rectangle Pattern
class HollowRectangle{
    public static void main(String[] args) {
        int n = 4;
        // First for Loop for Rows
        for(int row = 1 ; row <= n ; row++){
            //if 1st row or last row then --> each colum should have a star 
            //check if col == 1 or n
            if(row == 1 || row == n){
                for(int col = 1 ; col <= 6 ; col++){
                    System.out.print("* ");
                }
            }else{
                /*if row is not 1st or last then --> 1 col and last col should 
                have star rest everywhere it should be a space */
                for( int col = 1 ; col<= 6 ; col++){
                    //check if col==1 or 6 
                    if(col == 1 || col ==6){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
} 

//Hollow Right Angled Triangle 
class HollowRightTriangle{
    public static void main(String[] args) {
        int n = 5;
        // First Loop for Rows
        for(int row = 1 ; row<=n;row++){
            //if row == 1 or 2 or n --> start col from 1 to row number print *
            if(row == 1 || row ==2 || row == n){
                for(int col = 1 ; col <= row ; col++){
                    System.out.print("* ");
                }
            }else{
                //For row number other than 1,2,n
                // Single Star
                System.out.print("* ");
                // Row-2 spaces 
                for(int col = 1 ; col <= row-2 ; col++){
                    System.out.print("  ");
                }
                //Single Star
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}


//Hollow Pyramid 
class HollowPyramid{
    public static void main(String[] args) {
        int n=5;
        for(int row = 1 ; row<=n ; row++){
            //Spaces
            for(int sp = 1 ; sp <= n-row ; sp++){
                System.out.print("  ") ;
            }
            //if row == 1 or n ,  print stars with formula --> 2*row-1
            if(row == 1 || row == n){
                for(int col = 1 ; col<= 2*row-1 ; col++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                //formula (2*row+1-4) for calculating mid spaces for rows other than 1 and n
                for(int k = 1 ; k<= 2*row+1-4 ;k++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.err.println();
        }
    }
}

//Hollow Diamond 
class HollowDiamond{
    public static void main(String[] args){
        int n = 4;
        //Straight Hollow Pattern
        //Rows
        for(int row = 1 ;row<= n ; row++){
            //Spaces from 1 --> n-row
            for(int col = 1 ; col <= n-row ; col++){
                System.out.print("  ");
            }
            //if 1st row print *
            if(row == 1){
                System.out.print("* ");
            }else{
                System.out.print("* ");
                //Inner Spaces To make it hollow formula (2*row-3)
                for(int j = 1 ;j<= 2*row-3 ; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        //Inverted Hollow Pattern
        //Rows -- Outer Loop (loop ends at n-1)
        for(int row = 1 ; row <= n-1 ; row++){
            for(int col = 1 ; col <= row ;col++){
                System.out.print("  ");
            }
            //if last row ( n-1 ) then print * 
            if(row == n-1){
                System.out.print("* ");
            }else{
                System.out.print("* ");
                //calculating Inner spaces formula ( 2*(n-row)-3)
                for(int j = 1 ; j<= 2*(n-row)-3 ; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.err.println();
        }
    }
}

//Solid Butterfly Pattern
class SolidButterfly{
    public static void main(String[] args) {
        int n = 4;
        //Upper Part 
        for(int row = 1 ;row <= n ;row++){
            //star Printing
            for(int col = 1 ;col <= row;col++){
                System.out.print("* ");
            }
            //space Printing
            for(int col = 1 ; col <= 2*(n-row) ; col++){
                System.out.print("  ");
            }
            //star Printing
            for(int col = 1 ;col <= row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower Part (Inverted Symmetrical Half)
        for( int row = 1 ; row <= n ; row++){
            //star Printing
            for(int col = 1 ; col <= n-row+1 ; col++){
                System.out.print("* ");
            }
            //Space Calculation
            for(int col = 1 ; col<= 2*row-2 ; col++){
                System.out.print("  ");
            }
            //star Printing 
            for(int col = 1 ; col <= n-row+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}

//NUMERICAL PATTERNS
class NumericFirst{
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1 ; row<= n ;row++){
            for(int col = 1 ; col<=row ;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}