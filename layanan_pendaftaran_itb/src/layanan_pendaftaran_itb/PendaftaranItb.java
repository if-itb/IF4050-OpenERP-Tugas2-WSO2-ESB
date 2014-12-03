package layanan_pendaftaran_itb;

public class PendaftaranItb {
	public String nomor_daftar(String nomor_snmptn) {
		switch( nomor_snmptn ) {
		case "12345":
			return "18211030";
		case "3456":
			return "18211046";
		case "5678":
			return "18212034";
		}
		
		return "99999999";
	}
}
