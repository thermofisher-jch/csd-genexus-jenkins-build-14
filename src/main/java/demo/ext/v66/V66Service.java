package demo.ext.v66;

public class V66Service implements demo.ext.Service {
	public void doServiceWork( String name, int value ) {
		System.out.println(
			String.format("%s: %d", name, value)
		);
	}
}
