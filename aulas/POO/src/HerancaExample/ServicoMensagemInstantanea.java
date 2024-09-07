package HerancaExample;

public class ServicoMensagemInstantanea {
    public void sendMessage(){
        //primeiro confirmar se esta conectado a internet
        validarConectadoInternet();
        System.out.println("SENDING MESSAGE");
        salvarHistoricoMensagem();
    }

    public void recieveMessage(){
        System.out.println("RECIEVING MESSAGE");
    }

    private void validarConectadoInternet(){
        System.out.println("VALIDATING THE INTERNET CONNECTION");
        //ENCAPSULADO NO SEND MESSAGE
    }

    private void salvarHistoricoMensagem(){
        System.out.println("SAVING THE MESSAGE HISTORY");
        //ENCAPSULADO NO SEND MESSAGE
    }
}
