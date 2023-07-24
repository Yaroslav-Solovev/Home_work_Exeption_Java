package HWork_3.Core.Data;

public class Base {
    protected Integer id; //** Идентификационный номер */ 
    protected String surname; //** Фамилия */ 
    protected String name; //** Имя */ 
    protected String patronymic; //** Отчество */ 
    protected String dateBirth; //** Дата рождения */ 
    protected String gender; //** Пол */ 
    protected Integer phoneNumber; //** Номер телефона */ 

    public Base(Integer id, String surname, String name, String patronymic, String dateBirth, String gender,
    Integer phoneNumber){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;

    }

    ///++++///
    public Integer getId(){
        return id;
    }
    public String getSurname(){
        return surname;
    }
    public String getName(){
        return name;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public String getDateBirth(){
        return dateBirth;
    }
    public String getGender(){
        return gender;
    }
    public Integer getPhoneNumber(){
        return phoneNumber;
    }

    ///++++///
    public void setId(Integer id){
        this.id = id;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }
    public void setDateBirth(String dateBirth){
        this.dateBirth = dateBirth;
    }
    public void setGender(String gender){
        this.gender = gender;
    }    
    public void setPhoneNumber(Integer phoneNumber){
        this.phoneNumber = phoneNumber;
    }    

    ///++++///
    public String getInfo() {
        return String.format("ID: %s, Surname: %s, Name: %s, Patronymic: %s, Date birth: %s, Gender: %s., Phone number: %s.", 
        this.id, this.surname, this.name, this.patronymic, this.dateBirth, this.gender,
        this.phoneNumber, this.getClass().getSimpleName());
    }
}