package nim_id;

public class Snmptn {

	public Snmptn(){
		
	}
	
	public int Cek_kelulusan(String no_pendaftaran){
		switch(no_pendaftaran){
			case "12345":
				return 1;
			case "3456":
				return 1;
			case "5678":
				return 1;
		}
		return 0;
	}
	
}
