package POOUm;

public class Main {
        public static void main(String[] args) {

            Personagem itadori = new Personagem();

            itadori.nome = "Yuuji Itadori";
            itadori.forca = 95;
            itadori.classe = "Especial";
            itadori.expansao = "Indefinida";

            itadori.mostrarStatus();
            itadori.expansaoDominio();

            Personagem yuta = new Personagem();

            yuta.nome = "Yuta Okkotsu";
            yuta.forca = 93;
            yuta.classe = "Especial";
            yuta.expansao = "Amor Verdadeiro e Mútuo";

            yuta.mostrarStatus();
            yuta.expansaoDominio();

            Personagem sukuna = new Personagem();

            sukuna.nome = "Ryomen Sukuna";
            sukuna.forca = 99;
            sukuna.classe = "Rei das Maldições";
            sukuna.expansao = "Santuário Malevolente";

            sukuna.mostrarStatus();
            sukuna.expansaoDominio();
        }
}
