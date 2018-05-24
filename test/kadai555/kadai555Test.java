package kadai555;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class kadai555Test {

	@Test
	public void 数字を英訳するメソッド() {
	 IntToEng ite = new IntToEng();
	 String expected = "two thousand";
	 String actual = ite.translateEng(2000);
	 assertThat(actual,is(expected));
	}

}
