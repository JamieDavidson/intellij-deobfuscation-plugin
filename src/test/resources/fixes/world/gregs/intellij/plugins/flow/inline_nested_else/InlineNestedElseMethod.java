class Comparator {

    private int first = 1;
    private int second = 2;

    public void method() {
        if (first == 1) {
            second = 1;
        } <caret>else {
            if("".equals("")) {
                second = 2;
            }
        }
    }

}