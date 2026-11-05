public class SyntaxVisitor implements Visitor {
    public void visit(Python python){
        System.out.println("Python syntax is simple");
    }
    public void visit(Java java){
        System.out.println("Java syntax is complex");
    }
}
