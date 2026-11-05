public class Main {
    public static void main(String[] args){
        ProgrammingLanguage python = new Python();
        ProgrammingLanguage java = new Java();

        ProgrammingLanguage[] langs = {python, java};

        SyntaxVisitor syntaxVisitor = new SyntaxVisitor();
        PerformanceVisitor performanceVisitor = new PerformanceVisitor();

        for (ProgrammingLanguage lang : langs){
            lang.accept(syntaxVisitor);
            lang.accept(performanceVisitor);
        }
    }
}