package nim_id;

public class nim_id_src {
	
	public nim_id_src(){
		
	}
	
	public String cek_prodi(String nim){
		switch(nim){
			case "135":
				return "Teknik Informatika";
			case "182":
				return "Sistem dan Teknologi Informasi";
			case "165":
				return "Sekolah Teknik Elektro dan Informatika";
		}
		return "404 Not Found";
	}

}
