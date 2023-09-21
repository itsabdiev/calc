public class Model {
    private final View view;
    private ReversePolishNotation reversePolishNotation;
    public Model(View view) {
        System.out.println("Model is ready");
        this.view = view;
        reversePolishNotation = new ReversePolishNotation();
    }


}