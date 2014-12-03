
public class Cek {
	public int tagihan(String NIM){
		String fak;
		int tempSKS;
		int tempTagihan = 0;
		fak = NIM.substring(0, 2);
		tempSKS = getSKS(fak);
		if (tempSKS!=0){
		tempTagihan = tempSKS*50000;
		}
		return tempTagihan;
	}
	
	public int getSKS(String Fak){
		int SKS;
		int intFak;
		intFak = Integer.parseInt(Fak);
		switch (intFak){
		case 160:SKS= 18;break;
		case 161:SKS= 18;break;
		case 162:SKS= 19;break;
		case 163:SKS= 17;break;
		case 164:SKS= 16;break;
		case 165:SKS= 18;break;
		case 166:SKS= 21;break;
		case 167:SKS= 20;break;
		case 168:SKS= 18;break;
		case 169:SKS= 17;break;
		case 199:SKS= 12;break;
		case 182:SKS= 22;break;
		default : SKS= 0;break;
		}
		return SKS;
	}
}
