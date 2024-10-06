public class IntList {
    public int first;
    public IntList next;

    public IntList(int x, IntList n){
        first = x;
        next = n;
    }

    /** Create new IntLists recursively. */
    public static IntList square(IntList L){
        IntList res;
        if(L.next == null){
            res = new IntList(L.first*L.first, null);
            return res;
        }
        res = new IntList(L.first*L.first, square(L.next));
        return res;
    }

    /** Create new IntLists iteratively. */
    public static IntList iterativeSquare(IntList L){
        IntList res = new IntList(L.first*L.first, null);
        IntList p1 = L.next;
        IntList p2 = res;
        while(p1 != null){
            p2.next = new IntList(p1.first*p1.first, null);
            p1 = p1.next;
            p2 = p2.next;
        }
        return res;
    }

    /** Change the instance variables recursively. */
    public static IntList squareMutative(IntList L){
        if(L.next == null){
            L.first = L.first * L.first;
            return L;
        }
        L.first = L.first * L.first;
        L.next = squareMutative(L.next);
        return L;
    }

    public static void printList(IntList L){
        if(L ==null){
            return;
        }
        printList(L.next);
        System.out.print(L.first + " ");
    }

    public static void main(String[] args) {
        IntList L = new IntList(1, null);
        L = new IntList(2, L);
        L = new IntList(3, L);
        L = new IntList(4, L);
        printList(square(L));
        System.out.println();
        printList(iterativeSquare(L));
        System.out.println();
        printList(squareMutative(L));
    }
}
