package src.main.attestations.attestation01;

import src.main.attestations.attestation01.model.User;
import src.main.attestations.attestation01.represitory.Impl.UsersRepositoryFileImpl;
import src.main.attestations.attestation01.represitory.UsersRepository;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class app {
    public static void main(String[] Args) {
        UsersRepository usersRepository = new UsersRepositoryFileImpl();

        List <User>users = usersRepository.findAll();
        System.out.println(users);





        User user = usersRepository.findById("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");
        System.out.println(user);


//        usersRepository.deleteById("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");





//        User newUser = usersRepository.deleteAll();

//        UsersRepository.deleteById("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");




 //       List <User>users2 = (List<User>) Collections.singletonList(usersRepository.findById(ID));
//        System.out.println(users2);

//            System.out.println("Введите ID пользователя, которого хотите найти");
//            Scanner scanner2 = new Scanner(System.in);
//            String ID2 = String.valueOf(scanner.nextInt());

















//        User User = new User();
//
//
//            System.out.println("Введите пароль");
//            Scanner scanner = new Scanner(System.in);
//
//            User.setPassword(scanner.nextLine());
//
//        System.out.println(User.getPassword());
    }

}



