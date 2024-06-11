package ar.utn.frba.dds.utils.logger;

import ar.utn.frba.dds.utils.ICustomException;
import ar.utn.frba.dds.utils.IObserver;

public class Logger implements IObserver {

    public void log(Error error) {
        //TODO adapter contra componente errorlog
    }

    @Override
    public void serNotificadoDeError(ICustomException exception) {
        this.log(Error.of(exception.getCustomMessage(), exception.getCustomStackTrace()));
    }
}
