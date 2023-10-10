/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appplayer;

/**
 *
 * @author igor
 */
public class Musica {

    // Atributos
    private int duracao; // minutos
    //private String genero;
    private Genero genero;
    private int ano;
    private String nome;
    private String album;
    private String letra;
    
    // Construtor
    public Musica(){
        System.out.println("Carregando música...");
    }
    
    public Musica(String nome){
        setNome(nome);
    }
    
    public Musica(String nome, Genero genero){
        setNome(nome);
        setGenero(genero);
    }

    // Encapsulamento
    // Métodos: get (recuperar), set (definir)
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (this.duracao == 0) {
            this.duracao = duracao;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    // Métodos
    public void reproduz() {
        System.out.printf("Música '%s' tocando...", getNome());
        System.out.println();
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
