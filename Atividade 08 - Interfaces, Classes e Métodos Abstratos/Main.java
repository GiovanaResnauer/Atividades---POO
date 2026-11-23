public class Main {
    public static void main(String[] args) {

        Ebook ebook = new Ebook("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        VideoDigital video = new VideoDigital("Vida Selvagem", "National Geographic");

        ItemBibliotecaDigital[] itens = {ebook, video};

        for (ItemBibliotecaDigital item : itens) {
            System.out.println(item.descricao());
        }

        ebook.baixar();

        video.baixar();
        video.visualizar();
    }
}
