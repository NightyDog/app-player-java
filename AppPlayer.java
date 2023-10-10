/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appplayer;

/**
 *
 * @author igor
 */
public class AppPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Musica minhaMusica1;
        minhaMusica1 = new Musica("Master of Puppets");
        //minhaMusica1.nome = "Master of Puppets";
        //minhaMusica1.setNome("Master of Puppets");
        //minhaMusica1.duracao = 4;
        minhaMusica1.setDuracao(4);
        minhaMusica1.reproduz();
        //minhaMusica1.setDuracao(2); // Não funciona
        minhaMusica1.reproduz();
        minhaMusica1.reproduz();
        System.out.println("Duração: " + minhaMusica1.getDuracao());

        Musica minhaMusica2 = new Musica("Enter Sandman", new Genero("Rock"));
        //minhaMusica2.nome = "Enter Sandman";
        //minhaMusica2.setNome("Enter Sandman");
        //Genero generoMusica2 = new Genero("Rock");
        //generoMusica2.setNome("Rock");
        //minhaMusica2.setGenero(new Genero("Rock"));
        minhaMusica2.reproduz();
    }
}
