
public class spiiral {
    public static void printspiral(int arr[][]){
        int startcol=0,startrow=0,endcol=arr[0].length-1,endrow=arr.length-1;
        while(startcol<=endcol && startrow<=endrow){
            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]+" ");
            }
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}     
                                };
                                printspiral(arr);
    }
    
}
