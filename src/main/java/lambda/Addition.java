package lambda;

@FunctionalInterface //lambda를 인터페이스에는 필수(실수를 줄여줌)
public interface Addition {
    public int add(int[] numbers);
}
