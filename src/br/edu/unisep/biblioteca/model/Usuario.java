package br.edu.unisep.biblioteca.model;


    public class Usuario {
        private String nome;
        private int idade;

        public Usuario() {
        }

        public Usuario(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        @Override
        public String toString() {
            return "Usuario\n" +
                    "Nome: " + this.nome + "\n" +
                    "Idade: " + this.idade;
        }
    }
}
