public class Formatador_CEP {
    
    public static void main(String[] args) {
        try{
            // String cepFormatado = formatarCep("23765064"); // roda
            String cepFormatado = formatarCep("2376506"); // da erro e joga pro catch
            System.out.println(cepFormatado);
        }
        catch(CepInvalidoException e){
            System.out.println("O cep está fora de formato");
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            return "23.765-064";
    }
}
