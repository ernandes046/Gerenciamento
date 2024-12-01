package br.edu.unisep.biblioteca.model;


    public class Livro {
        private String nome;
        private String tipo;
        private String autor;
        private int ano;

        public Livro() {
        }

        public Livro(String nome, String tipo, String autor, int ano) {
            this.nome = nome;
            this.tipo = tipo;
            this.autor = autor;
            this.ano = ano;
        }

        public String getNome() {
            return nome;
        }

        public String getTipo() {
            return tipo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAno() {
            return ano;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        @Override
        public String toString() {
            return "Livro\n" +
                    "Nome: " + this.nome + "\n" +
                    "Tipo: " + this.tipo + "\n" +
                    "Autor: " + this.autor + "\n" +
                    "Ano: " + this.ano;
        }
    }
}
