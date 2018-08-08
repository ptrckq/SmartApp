import com.intern.redhat.Pessoa;
import org.junit.Test;
import static org.junit.Assert;

public class TestePessoa{


	@Test
	public void testGetNome(){
		Pessoa p = new Pessoa();
		p.setIdade(20);
		p.setNome("Patrick");

		Assert.assertEquals(p.getNome(),"Patrick");
	}
}

