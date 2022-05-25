package ch17;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Person implements Externalizable{
	
	String name;
	String job;         
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
	
	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		
		name = obj.readUTF();
		job = obj.readUTF();
	}
	
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		
		obj.writeUTF(name);
		obj.writeUTF(job);
	}
	
}

public class ExternalizableTest {	
	
	public static void main(String[] args) {

		Person personLee = new Person("이상용", "대표이사");
		Person personYoon = new Person("윤이나", "비선실세");
		
		try( FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personYoon);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		try( FileInputStream fos = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fos)){
			
			Person pLee = (Person) ois.readObject();
			Person pYoon = (Person) ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pYoon);
			
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		
	}

}
