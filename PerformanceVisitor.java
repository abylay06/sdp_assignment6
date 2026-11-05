public class PerformanceVisitor implements Visitor {
    public void visit(Python python){
        System.out.println("Python is slower");
    }
    public void visit(Java java){
        System.out.println("Java is faster");
    }
}