package AbstractAula;

public class MainFeiticeiro {
    public static void main(String[] args) {
        Gojo satoru = new Gojo();

        satoru.setNome("GOJO SATORU");

        System.out.println("OLÁ, MEU NOME É: " + satoru.getNome());

        satoru.expandirDominio();
        satoru.classeFeiticeiro();


        System.out.println("--------------------------------");

        Nanami nanami = new Nanami();

        nanami.setNome("NANAMI");

        System.out.println("OLÁ MEU NOME É: " + nanami.getNome());

        nanami.expandirDominio();
        nanami.classeFeiticeiro();

        System.out.println("--------------------------------");

        Nobara kugisaki = new Nobara();

        kugisaki.setNome("NOBARA KUGISAKI");

        System.out.println("OLÁ MEU NOME É: " + kugisaki.getNome());

        kugisaki.expandirDominio();
        kugisaki.classeFeiticeiro();
    }
}
