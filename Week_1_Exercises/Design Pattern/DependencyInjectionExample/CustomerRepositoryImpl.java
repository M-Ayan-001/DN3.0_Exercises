
public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public String findCustomerById(int id) {
		return "Ayan Mukherjee " + id;
	}
}
