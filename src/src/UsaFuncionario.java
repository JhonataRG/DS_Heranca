public class UsaFuncionario {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jhonata");
        funcionario.setRg("52.678.345-x");
        funcionario.setCartao("SO678");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRg());
        System.out.println(funcionario.getCartao());
    }
}
