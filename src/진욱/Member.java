package 진욱;

import java.sql.Date;
import java.sql.Timestamp;

public class Member {
    private int member_num;
    private int pt_count;
    private Timestamp reg_date;
    private Date exp_date;
    private String login_id;
    private String login_pw;
    private String gender;
    private int age;
    private int trainer_num;
    private int charge_num;
    private String name;

    public Member() {
    }

    public Member(int member_num, String name){
        this.member_num = member_num;
        this.name = name;
    }

    public Member(int member_num, int pt_count, Timestamp reg_date, Date exp_date, String login_id, String login_pw, String gender, int age, int trainer_num, int charge_num) {
        this.member_num = member_num;
        this.pt_count = pt_count;
        this.reg_date = reg_date;
        this.exp_date = exp_date;
        this.login_id = login_id;
        this.login_pw = login_pw;
        this.gender = gender;
        this.age = age;
        this.trainer_num = trainer_num;
        this.charge_num = charge_num;
    }

    public int getMember_num() {
        return member_num;
    }

    public void setMember_num(int member_num) {
        this.member_num = member_num;
    }

    public int getPt_count() {
        return pt_count;
    }

    public void setPt_count(int pt_count) {
        this.pt_count = pt_count;
    }

    public Timestamp getReg_date() {
        return reg_date;
    }

    public void setReg_date(Timestamp reg_date) {
        this.reg_date = reg_date;
    }

    public Date getExp_date() {
        return exp_date;
    }

    public void setExp_date(Date exp_date) {
        this.exp_date = exp_date;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getLogin_pw() {
        return login_pw;
    }

    public void setLogin_pw(String login_pw) {
        this.login_pw = login_pw;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrainer_num() {
        return trainer_num;
    }

    public void setMy_trainer(int trainer_num) {
        this.trainer_num = trainer_num;
    }

    public int getCharge_num() {
        return charge_num;
    }

    public void setCharge_num(int charge_num) {
        this.charge_num = charge_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "회원번호=" + member_num +
                ", pt횟수=" + pt_count +
                ", 등록일=" + reg_date +
                ", 만료일=" + exp_date +
                ", id='" + login_id + '\'' +
                ", pw='" + login_pw + '\'' +
                ", 성별='" + gender + '\'' +
                ", 나이=" + age +
                ", 트레이너번호=" + trainer_num +
                ", 요금제번호=" + charge_num +
                ", 회원명 =" + name +
                '}';
    }
}
