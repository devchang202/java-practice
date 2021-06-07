package uni.practice5;

public enum eVIEWING_CLASS{
    C9(9),
    C12(12),
    C15(15),
    C18(18);

    private final int value;
    eVIEWING_CLASS(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }
}
