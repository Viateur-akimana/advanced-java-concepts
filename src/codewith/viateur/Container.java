package codewith.viateur;

public class Container<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void showValue() {
        System.out.println("The value is " + getValue());
    }

    public static void main(String[] args) {
        Container<String> values = new Container<String>();
        values.value = "Viateur";
        values.showValue();
    }
}
