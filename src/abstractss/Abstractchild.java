package abstractss;


public class Abstractchild extends Abstract{
	@Override
	public void Studage() {
		System.out.println("student age is 17");
		}
	public static void main(String[] args) {
		Abstractchild c=new Abstractchild();
		c.studBl();
		c.Studage();

}
}
