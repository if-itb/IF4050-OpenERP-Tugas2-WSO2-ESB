package nim_id;

public class Nim {
	
	public Nim(){
		
	}
	
	public String cek_prodi(String nim){
		String prefiks = nim.substring(0, 3);
		
		switch(prefiks){
			case "101":
				return "Matematika";
			case "102":
				return "Fisika";
			case "103":
				return "Astronomi";
			case "104":
				return "Mikrobiologi";
			case "135":
				return "Teknik Informatika";
			case "182":
				return "Sistem dan Teknologi Informasi";
			case "105":
				return "Kimia";
			case "106":
				return "Biologi";
		}
		return "404";
	}
	
	public String cek_angkatan(String nim){
		String angkatan = nim.substring(3, 5);
		return "20"+angkatan;
	}

}
