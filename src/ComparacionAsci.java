public class ComparacionAsci {

    private String palabra;

    public ComparacionAsci(String palabra){
        this.palabra=palabra;
    }

    public boolean check(){
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.codePointAt(i)<65 || palabra.codePointAt(i)>122||(palabra.codePointAt(i)>90 && palabra.codePointAt(i)<97)){
                return false;
            }
        }
        return true;
    }
}
