package hw11Q3Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		
		ColumbiaUniversity cu = new ColumbiaUniversity();
		cu.biology();
		cu.anatomyLab();
		cu.hygiene();
		cu.lawInfo();
		cu.commonRoom();
		cu.laboratory();
		cu.languageClub();
		cu.emergencyRoom();
		cu.surgeryRoom();
		cu.cafeteria();
		cu.vocationalInfo();
		cu.classSize();
		cu.playGround();
		cu.teacher();
		cu.biochemistryLab();
		cu.gymnasium();
		cu.caring();
		cu.maths();
		cu.mechanicalLab();
		cu.aeronauticalInfo();
		cu.computerLab();
		cu.anthropology();
		cu.dorm();
		cu.morgue();
		
		University un = new ColumbiaUniversity();
		un.classSize();
		un.gymnasium();
		un.playGround();
		un.teacher();
		University.library();
		un.commonRoom();
		un.dorm();
		un.laboratory();
		un.languageClub();
		un.cafeteria();
		un.emergencyRoom();
		un.morgue();
		un.surgeryRoom();
		
		MedicalSchool ms = new ColumbiaUniversity();
		ms.anatomyLab();
		ms.biochemistryLab();
		ms.caring();
		ms.hygiene();
		ms.lawInfo();
		ms.aeronauticalInfo();
		ms.maths();
		ms.mechanicalLab();
		ms.anthropology();
		ms.computerLab();
		
	}

}
