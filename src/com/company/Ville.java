public class Ville {
    private int Code ;
    private String NomVille;

    public Ville(int code, String nomVille) {
        Code = code;
        NomVille = nomVille;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getNomVille() {
        return NomVille;
    }

    public void setNomVille(String nomVille) {
        NomVille = nomVille;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Ville{" +
                "Code=" + Code +
                ", NomVille='" + NomVille + '\'' +
                '}';
    }
}
