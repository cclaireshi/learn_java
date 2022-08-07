class Pascal_Powers {
    public int combination(int n, int k) {
        int top = 1;
        for (int i = n; i > n-k; i-- ) {
            top = top * i; 
           
        }
       
        int bottom = 1; 
        for (int i = k; i != 0; i--) {
            bottom = bottom * i;
           
        }
        return (top/bottom);
         
    }

    public int powof11(int n) {
        int result = 0; 
        for (int k = 0; k < n+1; k++) {
            double doublepower = Math.pow(10, n-k); 
            int intpower = (int)Math.round(doublepower);
            result = result + combination(n, k) * intpower;    
        }
        return result; 
    }

    public int powof2(int n) {
        int result = 0; 
        for (int k = 0; k < n+1; k++) {
            result = result + combination(n, k); 
        }
        return result; 
    }

}

public class PascalPowers {
    public static void main(String[] args) {
        Pascal_Powers power1 = new Pascal_Powers(); 
        int second_power = power1.powof11(6); 
        System.out.println(second_power);
        System.out.println(power1.powof2(10));
    }
}