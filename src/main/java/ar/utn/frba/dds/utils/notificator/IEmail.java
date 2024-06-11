package ar.utn.frba.dds.utils.notificator;

public interface IEmail {
    String getBody();
    String getTo();
    String[] getCC();
    String getFrom();
}
