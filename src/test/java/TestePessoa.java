import com.intern.redhat.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestePessoa{


	@Test
	public void testGetNome(){
		Pessoa p = new Pessoa();
		p.setIdade = 20;
		p.setNome = "Patrick";

		Assert.assertEquals(p.getNome,"Patrick");
	}
}

