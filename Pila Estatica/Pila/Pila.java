import java.util.Arrays;

public class Pila {
    private int[] array;
    private int size = 9;
    private int top = -1;
    private boolean isEmpty = true;
    private boolean isFull = false;
    int data;

    Pila (){
        array = new int[10];
    }

    public boolean push(int data)  {

        try {
            if (!isFull) {
                this.array[top+1] = data;
                top++;
                isEmpty = false;
                //System.out.println(pila[top]);
                return true;
            } else {
                if (top == size) {
                    isFull = true;
                }
            }
            return false;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Campos llenos");
        }

           return false;
    }

    public boolean pop(){
        if (!isEmpty) {
            data = this.array[top];
            array[top] = 0;
            top --;
        }else {
            if (top == -1){
                System.out.println("Pila vacia");
                isEmpty = true;
            }

        }
        return false;
    }
    public String showPila(){
        return toString();
    }



    @Override
    public String toString() {
        return "Pila{" +
                "pila=" + Arrays.toString(array) +
                '}';
    }
}
