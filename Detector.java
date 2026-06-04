import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Detector {

	public static void main(String[] args) {
		List<Transacao> dados = new ArrayList<>();
			
		for (int i = 0; i < 1000; i++) {
			Double valor;
			String cpf;
			
			if (i % 10 == 0) {
				valor =  ThreadLocalRandom.current()
	                    .nextDouble(1000, 10000);

	            cpf = "000" + String.valueOf(
	                    ThreadLocalRandom.current()
	                    .nextLong(0000000L, 99999999L)); 
			}
			else {
			
			valor =  ThreadLocalRandom.current()
                    .nextDouble(1000, 10000);

            cpf = String.valueOf(
                    ThreadLocalRandom.current()
                    .nextLong(0000000000L, 99999999999L)
            );
				}

            Transacao transacao = new Transacao(
                    "TX" + i,
                    valor,
                    "PROCESSANDO",
                    cpf
            );
			

            dados.add(transacao);
		}
		
		
		long inicio = System.currentTimeMillis();
		//List<Transacao> suspeitas = dados.stream().filter(ValidorFraude::ehSuspeita).toList();
		List<Transacao> suspeitas = dados.parallelStream().filter(ValidorFraude::ehSuspeita).toList();
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo:" + (fim - inicio) +"ms"); 
		System.out.println("Fraudes encontradas: " + suspeitas.size());
	
	}

}
