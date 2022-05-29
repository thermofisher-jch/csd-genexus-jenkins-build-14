package demo.ext.v68;

public class V68Service implements demo.ext.Service {
	public void doServiceWork( String name, int value ) {
		System.out.println(
			String.format("%s: %d", name, value)
		);
	}
}
