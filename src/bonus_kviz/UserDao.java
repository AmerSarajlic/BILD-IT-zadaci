package bonus_kviz;

import java.util.ArrayList;

public interface UserDao {

	public User getUser(String name);

	public User getScore(int score);

	public void addUser(User user);

	public void deleteUser(int rollNo);

	public ArrayList<User> getAllUsers();


}
