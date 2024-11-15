class main {
    public static void main(String[] args) {
        String result="";
        String day="Saturday";
        result=switch(day) {
            case "Monday","friday" -> "7am";
            case "Saturdas" -> "9am";
            default -> "6am";
        };
        System.out.println(result);
    }
}