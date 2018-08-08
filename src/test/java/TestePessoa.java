import com.intern.redhat.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestePessoa{


	@Test
	public void testGetNome(){
		Pessoa p = new Pessoa();
		p.idade = 20;
		p.nome = "Patrick";

		Assert.assertEquals(p.nome,"Patrick");
	}
}

