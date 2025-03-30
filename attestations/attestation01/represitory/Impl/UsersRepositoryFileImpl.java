package src.main.attestations.attestation01.represitory.Impl;

import src.main.attestations.attestation01.model.User;
import src.main.attestations.attestation01.represitory.UsersRepository;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class UsersRepositoryFileImpl implements UsersRepository {

    private static final List<User> USERS = new ArrayList<>();
    private static final String FILE_PATH = "src/main/attestations/attestation01/userslist.txt";

    private void setPrivateField(User user, String fieldName, Object value) {
        try {
            java.lang.reflect.Field field = User.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(user, value);
            field.setAccessible(false);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при установке значения поля " + fieldName, e);
        }
    }

    private User parseUser(String line) {
        String[] parts = line.split("\\|");
        User user = new User();

        try {
            user.setLogin(parts[2]);
            user.setPassword(parts[3]);
            user.setConfirmPassword(parts[4]);
            user.setLastName(parts[5]);
            user.setFirstName(parts[6]);
            user.setMiddleName(parts[7].isEmpty() ? null : parts[7]);
            user.setAge(parts[8].isEmpty() ? null : Integer.parseInt(parts[8]));
            user.setWorker(Boolean.parseBoolean(parts[9]));

            setPrivateField(user, "id", parts[0]);
            setPrivateField(user, "createdAt", LocalDateTime.parse(parts[1]));

            return user;
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при парсинге пользователя: " + line, e);
        }
    }

    private List<User> reader() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_PATH));
            return lines.stream()
                    .filter(line -> !line.trim().isEmpty())
                    .map(this::parseUser)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private void saver(List<User> users) {
        try {
            Files.write(Paths.get(FILE_PATH),
                    users.stream()
                            .map(User::toString)
                            .collect(Collectors.toList()));
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при сохранении пользователей в файл", e);
        }
    }

    @Override
    public void create(User user) {
        List<User> users = reader();
        users.add(user);
        saver(users);
    }

    @Override
    public User findById(String id) {
        if (USERS.isEmpty()) {
            findAll();
            System.out.println("Нужный пользователь не найден, список пользователей: ");
        }
        return USERS.stream()
                .filter(user -> user.getID().equals(id))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Пользователь не найден "));
    }

    @Override
    public List<User> findAll() {
        if (USERS.isEmpty()) {
            try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
                List<User> usersFromFile = br.lines()
                        .map(line -> new User(line))
                        .toList();

                USERS.addAll(usersFromFile);
                return USERS;

            } catch (IOException e) {
                System.out.println("Ошибка чтения файла: " + e.getMessage());
                return Collections.EMPTY_LIST;

            }

        }
        return USERS;
    }

    @Override
    public void update(User user) {
        User userToUpdate = USERS.stream()
                .filter(u -> u.getID().equals(user.getID()))
                .findFirst()
                .orElse(null);

        if (userToUpdate != null) {
            userToUpdate = user;
            try (FileWriter fileWriter = new FileWriter(FILE_PATH, false)) {
                for (User u : USERS) {
                    if (u.getID().equals(userToUpdate.getID())) {
                        u = userToUpdate;
                        fileWriter.write(u.toString());
                        fileWriter.write("\n");
                    } else {
                        fileWriter.write(u.toString());
                        fileWriter.write("\n");
                    }
                }
            } catch (IOException ioe) {
                throw new RuntimeException("Ошибка обновления пользователя");
            }

            System.out.println("Пользователь обновлён");
        }
    }

    @Override
    public void deleteById(String id) {
        List<model.User> users = reader();
        boolean removed = users.removeIf(user -> user.getId().equals(id));
        if (!removed) {
            throw new exceptions.UserNotFoundException("Пользователь с ID " + id + " не найден");
        }
    }

    @Override
    public User deleteAll() {
        USERS.clear();
        try (BufferedWriter BufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))) {
            BufferedWriter.write("");
            BufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return null;
    }
}
