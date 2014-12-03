package nim_id;

public class Snmptn {

	public Snmptn(){
		
	}
	
	public String Cek_kelulusan(String no_pendaftaran){
		switch(no_pendaftaran){
			case "12345":
				return no_pendaftaran;
			case "3456":
				return no_pendaftaran;
			case "5678":
				return no_pendaftaran;
		}
		return "Tidak lulus";
	}
	
}
