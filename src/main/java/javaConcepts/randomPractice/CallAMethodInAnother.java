package javaConcepts.randomPractice;

public class CallAMethodInAnother {
    public CallAMethodInAnother() {}

    public String methodToCall() {
        return "This is a method called in another method";
    }

    public String callAMethod(String method) {
        return method;
    }
}
