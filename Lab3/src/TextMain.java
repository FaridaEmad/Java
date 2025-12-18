public class TextMain {
    public static void main(String[] args) {
        System.out.println("Split 11.343.hfhfa.4dsf using split");
        IPCutter.split("11.343.hfhfa.4dsf");
        System.out.println("Split 11.343.hfhfa.4dsf using string tokenizer");
        IPCutter.strTokenizer("11.343.hfhfa.4dsf");
        System.out.println("Split 11.343.hfhfa.4dsf using substring and indexof");
        IPCutter.strTokenizer("11.343.hfhfa.4dsf");
    }
}
