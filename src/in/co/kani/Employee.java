package in.co.kani;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String address;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Employee o) {
//		return (this.name.compareTo(o.getName())); Ascending Order by Name
//		return (this.id - o.getId());  Ascending Order by Id
//		return (o.getName().compareTo(this.name)); descending Order by Name
		
//		return (o.getId() - this.id );  descending Order by Id
		
		if(this.id == o.getId())
		{
			return 0;
		}
		else if(this.id > o.getId())
		{
			return 1;
		}
			return -1;
		
	}

	/*@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId() > o2.getId())
			return 1;
		else if(o1.getId() < o2.getId())
			return -1;
		return 0;
	}*/
	
	
}
