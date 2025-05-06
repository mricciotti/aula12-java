package controller;

import Model.Usuario;
import view.UsuarioView;

public class UsuarioController {
    private Usuario model;
    protected UsuarioView view;

    public UsuarioController(UsuarioView view){
        this.view = view;
    }

    public void cadastrarUsuario(){
        String nome = view.solicitarNome();
        int idade = view.solicitarIdade();

        model = new Usuario(nome, idade);

        view.mostrarMensagem("Usuario cadastrado com sucesso!");
        view.mostrarMensagem("Nome: " + model.getNome());
        view.mostrarMensagem("Idade: " + model.getIdade() + "anos");
    }
}
