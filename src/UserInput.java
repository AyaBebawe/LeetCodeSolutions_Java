public class UserInput {
    
    public static class TextInput {
        public StringBuilder currenttext = new StringBuilder();

        public void add(char c) {
            currenttext.append(c);
        }

        public String getValue() {
            return currenttext.toString();
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(char c) {
            if (Character.isDigit(c)) {
                super.add(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
