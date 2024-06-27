import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }   
    
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        
        LocalDate dataAtual = LocalDate.now();

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);


        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
            }
        }

        // Esses daqui não interagem:
        // Set<LocalDate> dateSet = eventosMap.keySet();
        // Collection<Evento> values = eventosMap.values();
    }
}
