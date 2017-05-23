package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Administrator ����һ������Entity
 */
@Entity
@Table(name = "four_diagnostic_information")
public class FourDiagnosticInformationDO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int patientId;// ����Id
    private int fatigue;// ����
    private int skinItching;// Ƥ������
    private int twoEyesDry;// ��Ŀ��ɬ
    private int blurredVision;// ����ģ��
    private int depression;// ����
    private int irritability;// ������ŭ
    private int insomnia;// ʧ��
    private int easyWakeUp;// ����
    private int tinnitus;// ����
    private int dryMouth;// �ڸ�
    private int mouthPain;// �ڿ�
    private int badBreath;// �ڳ�
    private int nausea;// ����
    private int belching;// ����
    private int abdominalDistention;// �丹����
    private int flankPainStinging;// в��ʹ-��ʹ
    private int flankPainSwell;// в��ʹ-��ʹ
    private int flankPainDull;// в��ʹ-��ʹ
    private int flankPainDiscomfort;// в��ʹ-����
    private int anorexia;// �ɲ�
    private int aphrodisiacCold;// η��֫��
    private int limb;// ֫������
    private int backacheFootSoft;// ���i����
    private int handFootFanHot;// ���㷳��
    private int urineYellow;// ���
    private int constipation;// ����
    private int looseStools;// ����
    private int perspiration;// �Ժ�
    private int nightSweats;// ����
    private int lowerExtremityEdema;// ��֫ˮ��
    private int faceDull;// ��ް�
    private int eyeYellow;// Ŀ��
    private int bodyYellow;// ���
    private int spiderNevus;// ֩��������
    private int liverPalm;// ����
    private int abdominalVeins;// ������������
    private int yellowTumor;// ��ɫ��
    private boolean complete;// �Ƿ����

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public int getSkinItching() {
        return skinItching;
    }

    public void setSkinItching(int skinItching) {
        this.skinItching = skinItching;
    }

    public int getTwoEyesDry() {
        return twoEyesDry;
    }

    public void setTwoEyesDry(int twoEyesDry) {
        this.twoEyesDry = twoEyesDry;
    }

    public int getBlurredVision() {
        return blurredVision;
    }

    public void setBlurredVision(int blurredVision) {
        this.blurredVision = blurredVision;
    }

    public int getDepression() {
        return depression;
    }

    public void setDepression(int depression) {
        this.depression = depression;
    }

    public int getIrritability() {
        return irritability;
    }

    public void setIrritability(int irritability) {
        this.irritability = irritability;
    }

    public int getInsomnia() {
        return insomnia;
    }

    public void setInsomnia(int insomnia) {
        this.insomnia = insomnia;
    }

    public int getEasyWakeUp() {
        return easyWakeUp;
    }

    public void setEasyWakeUp(int easyWakeUp) {
        this.easyWakeUp = easyWakeUp;
    }

    public int getTinnitus() {
        return tinnitus;
    }

    public void setTinnitus(int tinnitus) {
        this.tinnitus = tinnitus;
    }

    public int getDryMouth() {
        return dryMouth;
    }

    public void setDryMouth(int dryMouth) {
        this.dryMouth = dryMouth;
    }

    public int getMouthPain() {
        return mouthPain;
    }

    public void setMouthPain(int mouthPain) {
        this.mouthPain = mouthPain;
    }

    public int getBadBreath() {
        return badBreath;
    }

    public void setBadBreath(int badBreath) {
        this.badBreath = badBreath;
    }

    public int getNausea() {
        return nausea;
    }

    public void setNausea(int nausea) {
        this.nausea = nausea;
    }

    public int getBelching() {
        return belching;
    }

    public void setBelching(int belching) {
        this.belching = belching;
    }

    public int getAbdominalDistention() {
        return abdominalDistention;
    }

    public void setAbdominalDistention(int abdominalDistention) {
        this.abdominalDistention = abdominalDistention;
    }

    public int getFlankPainStinging() {
        return flankPainStinging;
    }

    public void setFlankPainStinging(int flankPainStinging) {
        this.flankPainStinging = flankPainStinging;
    }

    public int getFlankPainSwell() {
        return flankPainSwell;
    }

    public void setFlankPainSwell(int flankPainSwell) {
        this.flankPainSwell = flankPainSwell;
    }

    public int getFlankPainDull() {
        return flankPainDull;
    }

    public void setFlankPainDull(int flankPainDull) {
        this.flankPainDull = flankPainDull;
    }

    public int getFlankPainDiscomfort() {
        return flankPainDiscomfort;
    }

    public void setFlankPainDiscomfort(int flankPainDiscomfort) {
        this.flankPainDiscomfort = flankPainDiscomfort;
    }

    public int getAnorexia() {
        return anorexia;
    }

    public void setAnorexia(int anorexia) {
        this.anorexia = anorexia;
    }

    public int getAphrodisiacCold() {
        return aphrodisiacCold;
    }

    public void setAphrodisiacCold(int aphrodisiacCold) {
        this.aphrodisiacCold = aphrodisiacCold;
    }

    public int getLimb() {
        return limb;
    }

    public void setLimb(int limb) {
        this.limb = limb;
    }

    public int getBackacheFootSoft() {
        return backacheFootSoft;
    }

    public void setBackacheFootSoft(int backacheFootSoft) {
        this.backacheFootSoft = backacheFootSoft;
    }

    public int getHandFootFanHot() {
        return handFootFanHot;
    }

    public void setHandFootFanHot(int handFootFanHot) {
        this.handFootFanHot = handFootFanHot;
    }

    public int getUrineYellow() {
        return urineYellow;
    }

    public void setUrineYellow(int urineYellow) {
        this.urineYellow = urineYellow;
    }

    public int getConstipation() {
        return constipation;
    }

    public void setConstipation(int constipation) {
        this.constipation = constipation;
    }

    public int getLooseStools() {
        return looseStools;
    }

    public void setLooseStools(int looseStools) {
        this.looseStools = looseStools;
    }

    public int getPerspiration() {
        return perspiration;
    }

    public void setPerspiration(int perspiration) {
        this.perspiration = perspiration;
    }

    public int getNightSweats() {
        return nightSweats;
    }

    public void setNightSweats(int nightSweats) {
        this.nightSweats = nightSweats;
    }

    public int getLowerExtremityEdema() {
        return lowerExtremityEdema;
    }

    public void setLowerExtremityEdema(int lowerExtremityEdema) {
        this.lowerExtremityEdema = lowerExtremityEdema;
    }

    public int getFaceDull() {
        return faceDull;
    }

    public void setFaceDull(int faceDull) {
        this.faceDull = faceDull;
    }

    public int getEyeYellow() {
        return eyeYellow;
    }

    public void setEyeYellow(int eyeYellow) {
        this.eyeYellow = eyeYellow;
    }

    public int getBodyYellow() {
        return bodyYellow;
    }

    public void setBodyYellow(int bodyYellow) {
        this.bodyYellow = bodyYellow;
    }

    public int getSpiderNevus() {
        return spiderNevus;
    }

    public void setSpiderNevus(int spiderNevus) {
        this.spiderNevus = spiderNevus;
    }

    public int getLiverPalm() {
        return liverPalm;
    }

    public void setLiverPalm(int liverPalm) {
        this.liverPalm = liverPalm;
    }

    public int getAbdominalVeins() {
        return abdominalVeins;
    }

    public void setAbdominalVeins(int abdominalVeins) {
        this.abdominalVeins = abdominalVeins;
    }

    public int getYellowTumor() {
        return yellowTumor;
    }

    public void setYellowTumor(int yellowTumor) {
        this.yellowTumor = yellowTumor;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }


}
