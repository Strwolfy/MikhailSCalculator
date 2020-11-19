package Calculator;

public enum Roman {
        I(1), II(2), III (3), IV(4), V(5),
        VI(6), VII (7), VIII (8), IX (9),
        XL(40), XC(90), CD(400), CM (900),
        X(10), L(50), C(100), D(500), M(1000);
        private final int value;
        Roman(int value) {
            this.value = value;
        }
        public int toInt() {
            return value;
        }
}