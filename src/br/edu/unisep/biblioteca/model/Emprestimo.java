package br.edu.unisep.biblioteca.model;



import java.text.SimpleDateFormat;
import java.util.Calendar;

    public class Emprestimo {
        private Calendar data;
        private Calendar devolucao;
        private Livro livro;
        private Usuario usuario;

        public Emprestimo() {
        }

        public Emprestimo(Calendar data, Calendar devolucao) {
            this.data = data;
            this.devolucao = devolucao;
            this.livro = livro;
            this.usuario = usuario;
        }

        public Calendar getData() {
            return data;
        }

        public Calendar getDevolucao() {
            return devolucao;
        }

        public Livro getLivro() {
            return livro;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setData(Calendar data) {
            this.data = data;
        }

        public void setDevolucao(Calendar devolucao) {
            this.devolucao = devolucao;
        }

        public void setLivro(Livro livro) {
            this.livro = livro;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        @Override
        public String toString() {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            return "Emprestimo\n" +
                    "Livro: " + this.livro + "\n" +
                    "Usuario: " + this.usuario + "\n" +
                    "Data de emprestimo: " + sdf.format(this.data.getTime()) + "\n" +
                    "Data de devolucao: " + sdf.format(this.devolucao.getTime());
        }
    }
}
