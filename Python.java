public class Python implements ProgrammingLanguage {
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
