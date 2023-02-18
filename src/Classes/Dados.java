package Classes;

public class Dados {

    public boolean validar_Usuario(String textField_usuario, String passwordField_codigo, String passwordField_chave) {
        return textField_usuario.equals("ada-wrong") && passwordField_codigo.equals("re4") && passwordField_chave.equals("las-plagas");
    }
}
