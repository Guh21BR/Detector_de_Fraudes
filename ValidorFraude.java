
public class ValidorFraude {
	public static boolean ehSuspeita(Transacao t) {
		boolean ehFraude = false;
		try {
			Thread.sleep(05);
			if (t.getValor() > 5000 && t.getCpfCliente().startsWith("000")) {
			ehFraude = true; 
				}
			}catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		return ehFraude;
	}
}
