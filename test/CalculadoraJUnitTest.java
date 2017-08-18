
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class CalculadoraJUnitTest {
    
    @Test
    public void testarSoma(){
        Calculadora calculadora = new Calculadora();
        calculadora.setN1(10);
        calculadora.setN2(19);
        calculadora.somar();
        assertEquals(calculadora.somar(), 29);
    }
    @Test
    public void testarPessoaCadastro(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(10);
        PessoaDAO dao = new PessoaDAO();
        int codigoInserir =dao.inserir(pessoa);
        assertEquals(codigoInserir,0);
    }
    
}
