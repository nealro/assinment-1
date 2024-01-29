public class Fibonacci {
    int n;
    public static int fibsqu(int n) {
        if(n <= 1)
            return 1;
        else
            return fibsqu(n - 1) + fibsqu(n - 2);
    }

    @Override
    public int hashCode() {
        return n;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fibonacci) {
            Fibonacci other = (Fibonacci) obj;
            if(this.n == other.n)
                return true;
        }
        return false;
    }

    public String toString(){
        return "" + n;
    }
}