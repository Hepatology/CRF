package service;

import dto.PatientDTO;

public interface PatientService {

    /**
     * �洢����һ������
     * 
     * @param patientDTO
     */
    public void savePatientGeneralInformation(PatientDTO patientDTO);
}
