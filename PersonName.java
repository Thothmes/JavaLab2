public class PersonName {

    String Name;
    String Surname;
    String Patronymic;

    public PersonName(String Name) {
        this.Name = Name;
    }

    public PersonName(String Name, String Surname) {
        this.Name = Name;
        this.Surname = Surname;
    }

    public PersonName(String Name, String Surname, String Patronymic) {
        this.Name = Name;
        this.Surname = Surname;
        this.Patronymic = Patronymic;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (Surname != null) {
            sb.append(Surname + " ");
        }

        if (Name != null) {
            sb.append(Name + " ");
        }

        if (Patronymic != null) {
            sb.append(Patronymic + " ");
        }

        if (sb.isEmpty()) {
            return "";
        }

        sb.append("\n");

        return sb.toString();
    }
}