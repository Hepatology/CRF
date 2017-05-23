package entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class PatientDO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;// ����
    private String gender;// �Ա�
    private int age;// ����
    private float height;// ���
    private float weight;// ����
    private boolean smoke;// �Ƿ����
    private boolean drink;// �Ƿ�����
    private boolean familyHistory;// �Ƿ��м��岡ʷ
    private Date hepatitisDiagnosisTime;// ����ȷ��ʱ��
    private Date cirrhosisDiagnosisTime;// ��Ӳ��ȷ��ʱ��
    private String westernMedicineDiagnosis;// ��ҽ���
    private String chineseMedicineDiagnosis;// ��ҽ���
    private String westernMedicineTreatment;// ��ҽ����
    private String chineseMedicineTreatment;// ��ҽ����
    private boolean complete;// �Ƿ����

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }

    public boolean isDrink() {
        return drink;
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
    }

    public boolean isFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(boolean familyHistory) {
        this.familyHistory = familyHistory;
    }

    public Date getHepatitisDiagnosisTime() {
        return hepatitisDiagnosisTime;
    }

    public void setHepatitisDiagnosisTime(Date hepatitisDiagnosisTime) {
        this.hepatitisDiagnosisTime = hepatitisDiagnosisTime;
    }

    public Date getCirrhosisDiagnosisTime() {
        return cirrhosisDiagnosisTime;
    }

    public void setCirrhosisDiagnosisTime(Date cirrhosisDiagnosisTime) {
        this.cirrhosisDiagnosisTime = cirrhosisDiagnosisTime;
    }

    public String getWesternMedicineDiagnosis() {
        return westernMedicineDiagnosis;
    }

    public void setWesternMedicineDiagnosis(String westernMedicineDiagnosis) {
        this.westernMedicineDiagnosis = westernMedicineDiagnosis;
    }

    public String getChineseMedicineDiagnosis() {
        return chineseMedicineDiagnosis;
    }

    public void setChineseMedicineDiagnosis(String chineseMedicineDiagnosis) {
        this.chineseMedicineDiagnosis = chineseMedicineDiagnosis;
    }

    public String getWesternMedicineTreatment() {
        return westernMedicineTreatment;
    }

    public void setWesternMedicineTreatment(String westernMedicineTreatment) {
        this.westernMedicineTreatment = westernMedicineTreatment;
    }

    public String getChineseMedicineTreatment() {
        return chineseMedicineTreatment;
    }

    public void setChineseMedicineTreatment(String chineseMedicineTreatment) {
        this.chineseMedicineTreatment = chineseMedicineTreatment;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }



}
