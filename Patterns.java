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
            //Space Printing ( 1 --> n-1)
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