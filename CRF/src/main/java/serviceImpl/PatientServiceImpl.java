package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.PatientDTO;
import entities.PatientDO;
import repo.PatientRepo;
import service.PatientService;

/**
 * @author Administrator ����serviceImpl
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepo patientRepo;

    public void savePatientGeneralInformation(PatientDTO patientDTO) {
        patientRepo.save(convertToPatientDO(patientDTO));
    }

    /**
     * ��patientDTOת��ΪpatientDO
     */
    private PatientDO convertToPatientDO(PatientDTO patientDTO) {
        PatientDO patientDO = new PatientDO();
        patientDO.setAge(patientDTO.getAge());
        patientDO.setChineseMedicineDiagnosis(patientDTO.getChineseMedicineDiagnosis());
        patientDO.setChineseMedicineTreatment(patientDTO.getChineseMedicineTreatment());
        patientDO.setCirrhosisDiagnosisTime(patientDTO.getCirrhosisDiagnosisTime());
        patientDO.setComplete(patientDTO.isComplete());
        patientDO.setDrink(patientDTO.isDrink());
        patientDO.setFamilyHistory(patientDTO.isFamilyHistory());
        patientDO.setGender(patientDTO.getGender());
        patientDO.setHeight(patientDTO.getHeight());
        patientDO.setHepatitisDiagnosisTime(patientDTO.getHepatitisDiagnosisTime());
        patientDO.setName(patientDTO.getName());
        patientDO.setSmoke(patientDTO.isSmoke());
        patientDO.setWeight(patientDTO.getWeight());
        patientDO.setWesternMedicineDiagnosis(patientDTO.getWesternMedicineDiagnosis());
        patientDO.setWesternMedicineTreatment(patientDTO.getWesternMedicineTreatment());
        return patientDO;
    }
}
