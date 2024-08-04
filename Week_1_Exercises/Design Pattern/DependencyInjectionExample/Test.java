
public class Test {

	public static void main(String[] args) {

		CustomerRepository customerRepository = new CustomerRepositoryImpl();

		CustomerService customerService = new CustomerService(customerRepository);

		String customer = customerService.getCustomer(11500);
		System.out.println(customer);

	}
}
