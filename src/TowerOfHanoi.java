public class TowerOfHanoi {

    static void solveTowerOfHanoi(int n, char from, char aux, char to) {

        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from + " to rod " + to);
            return;
        }
        solveTowerOfHanoi(n - 1, from, to, aux);
        System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
        solveTowerOfHanoi(n - 1, aux, from, to);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; 
        solveTowerOfHanoi(numberOfDisks, 'A', 'B', 'C');
    }
}


