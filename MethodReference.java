
interface Parser {
    String parse(String s);
}

class Convert {
    public String converter(String s) {
        if (s.length() <= 4) {
            return s.toLowerCase();
        } else {
            return s.toUpperCase();
        }
    }
}

class printer {
    void print(String s, Parser p) {
        s = p.parse(s);
        System.out.println("Printing..." + s);
    }
}

class Main {
    public static void main(String[] args) {

        String val = "Jaya";
        printer p = new printer();
        Convert c = new Convert();
        p.print(val, c::converter);

    }
}