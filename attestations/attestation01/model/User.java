package src.main.attestations.attestation01.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class User {
        private String ID;
        private LocalDateTime Date;
        public String Login;
        public String Password;
        public String ConfirmPassword;
        public String Name;
        public String Surname;
        public String Middlename;
        public Integer Edge;
        private Boolean IsWorker;

        public User (String line) {
                String[] elements = line.split("\\|");
                this.ID = elements[0];
                this.Date = LocalDateTime.parse(elements[1], DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                this.Login = elements[2];
                this.Password = elements[3];
                this.ConfirmPassword = elements[4];
                this.Name = elements[5];
                this.Surname = elements[6];
                this.Middlename = elements[7];
                this.Edge = Integer.valueOf(elements[8]);
                this.IsWorker = false;
        }

//        public User(String ID, LocalDate date, String login, String password, String confirmPassword, String name, String surname, String middlename, Integer edge, Boolean inWorker) {
//                this.ID = ID;
//                Date = date;
//                Login = login;
//                Password = password;
//                ConfirmPassword = confirmPassword;
//                Name = name;
//                Surname = surname;
//                Middlename = middlename;
//                Edge = edge;
//                InWorker = false;
//        }
        public User() {
                this.Password = Password;
        }

        public String getID() {
                return ID;
        }

        public void setID(String ID) {
                this.ID = ID;
        }

        public LocalDateTime getDate() {
                return Date;
        }

        public void setDate(LocalDateTime date) {
                Date = date;
        }

        public String getLogin() {
                return Login;
        }

        public void setLogin(String login) {

                if (!login.matches("[A-Za-z0-9_]+") & login.length() >= 20) {
                        Login = login;
                }

        }

        public String getPassword() {
                return Password;
        }

        public void setPassword(String password) {
                Password = password;
//                if (Password.isEmpty()) {
//                        System.out.println("Введите корректный пароль, пароль не может быть пустым");
//                }

                if (!Password.matches("[A-Za-z0-9_]+") & Password.length() >= 20) {
                Password = password;
                } else {
                        System.out.println("Пароль должен содержать латинские буквы, цифы и нижнее подчеркивание. Пароль не может быть длиннее 20 символов.");
                }
        }

        public String getConfirmPassword() {
                return ConfirmPassword;
        }

        public void setConfirmPassword(String confirmPassword) {
                if (confirmPassword.equals(Password)) {
                        ConfirmPassword = confirmPassword;
                } else  {
                        System.out.println("Пароль не совпадает");
                }
        }

        public String getName() {
                return Name;
        }

        public void setName(String name) {
                if (!Name.matches("[A-Za-z)]")) {
                Name = name;
                } else {
                        System.out.println("Имя пользователя может содержать только буквы");
                }
        }

        public String getSurname() {
                return Surname;
        }

        public void setSurname(String surname) {
                if (!Surname.matches("[A-Za-z)]")) {
                        Surname = surname;
                } else {
                        System.out.println("Фамилия пользователя может содержать только буквы");
                }
        }

        public String getMiddlename() {
                return Middlename;
        }

        public void setMiddlename(String middlename) {
                if (!Middlename.matches("[A-Za-z)]") || middlename.isEmpty()) {
                        Middlename = middlename;
                } else {
                        System.out.println("Отчество пользователя не может содержать цифры");
                }

        }

        public Integer getEdge() {
                return Edge;
        }

        public void setEdge(Integer edge) {
                Edge = edge;
        }

        public Boolean getIsWorker() {
                return IsWorker;
        }

        public void setInWorker(Boolean inWorker) {
                IsWorker = inWorker;
        }

        @Override
        public boolean equals(Object o) {
                if (o == null || getClass() != o.getClass()) return false;
                User user = (User) o;
                return Objects.equals(ID, user.ID) && Objects.equals(Date, user.Date) && Objects.equals(Login, user.Login) && Objects.equals(Password, user.Password) && Objects.equals(ConfirmPassword, user.ConfirmPassword) && Objects.equals(Name, user.Name) && Objects.equals(Surname, user.Surname) && Objects.equals(Middlename, user.Middlename) && Objects.equals(Edge, user.Edge) && Objects.equals(IsWorker, user.IsWorker);
        }

        @Override
        public int hashCode() {
                return Objects.hash(ID, Date, Login, Password, ConfirmPassword, Name, Surname, Middlename, Edge, IsWorker);
        }


        @Override
        public String toString() {
                return "user{" +
                        "ID='" + ID + '|' +
                        ", Date=" + Date +
                        ", Login='" + Login + '\'' +
                        ", Password='" + Password + '\'' +
                        ", ConfirmPassword='" + ConfirmPassword + '\'' +
                        ", Name='" + Name + '\'' +
                        ", Surname='" + Surname + '\'' +
                        ", Middlename='" + Middlename + '\'' +
                        ", Edge=" + Edge +
                        ", InWorker=" + IsWorker +
                        '}';
        }
}
