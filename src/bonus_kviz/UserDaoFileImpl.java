package bonus_kviz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class UserDaoFileImpl implements UserDao {

	Path path = Paths.get("users.txt");
	User user = new User();

	public UserDaoFileImpl() {

	}

	@Override
	public User getUser(String name) {

		try (BufferedReader read = Files.newBufferedReader(path)) {
			String line = "";
			while ((line = read.readLine()) != null) {
				String[] array = line.split("/");
				if (name.equals(array[0])) {
					user.setUserName(array[0]);
					user.setPassword(array[1]);
					user.setScore(Integer.parseInt(array[2]));

				}
				else{
					System.out.println(KvizUI.USER_NOT_EXIST_MESSAGE);
				}

			}

		} catch (Exception e) {
			System.out.println("EXCEPTION!");
		}
		return user;
	}

	@Override
	public void addUser(User user) {

		try (BufferedWriter write = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
			write.write(user.getUserName() + "/" + user.getPassword() + "/" + user.getScore());
			write.newLine();
			
		} catch (Exception e) {
			System.out.println("EXCEPTION");
		}

	}

	@Override
	public User getScore(int score) {

		try (BufferedReader read = Files.newBufferedReader(path)) {
			String line = "";
			while ((line = read.readLine()) != null) {
				String[] array = line.split("/");
				user.setScore(Integer.parseInt(array[2]));

			}

		} catch (Exception e) {
			System.out.println("EXCEPTION!");
		}
		return user;
	}

	@Override
	public void deleteUser(int rollNo) {
		ArrayList<User> list = getAllUsers();
		list.remove(rollNo);

		try (BufferedWriter write = Files.newBufferedWriter(path)) {

			for (User u : list) {
				String allUsers = u.getUserName() + "/" + u.getPassword() + "/" + u.getScore();
				write.write(allUsers);
				write.newLine();

			}

		} catch (Exception e) {
			System.out.println("EXCEPTION");

		}
	}

	@Override
	public ArrayList<User> getAllUsers() {
		ArrayList<User> list = new ArrayList<>();

		try (BufferedReader read = Files.newBufferedReader(path)) {
			String line = "";
			while ((line = read.readLine()) != null) {
				String[] array = line.split("/");

				list.add(new User(Integer.parseInt(array[2]), array[0], array[1]));
			}
		} catch (Exception e) {
			System.out.println("EXCEPTION!");
		}

		return list;
	}

}