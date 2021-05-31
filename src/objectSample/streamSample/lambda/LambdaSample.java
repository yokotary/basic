package objectSample.streamSample.lambda;

class LambdaSample {
    public static void main(String[] args) {
        Runnable runner = () -> {
            System.out.println("Hello Lambda");
        };
        runner.run();
    }
}
