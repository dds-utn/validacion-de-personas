package ar.utn.frba.dds.utils.notificator;

import ar.utn.frba.dds.utils.ICustomException;
import ar.utn.frba.dds.utils.IObserver;

public class AdminEmailNotificator implements IObserver  {
    private IAdapterEmailNotificator adapterEmailNotificator;

    public AdminEmailNotificator(IAdapterEmailNotificator adapterEmailNotificator) {
        this.adapterEmailNotificator = adapterEmailNotificator;
    }

    @Override
    public void serNotificadoDeError(ICustomException exception) {
        this.adapterEmailNotificator.sendEmail(new IEmail() {
            @Override
            public String getBody() {
                //TODO
                return null;
            }

            @Override
            public String getTo() {
                //TODO
                return null;
            }

            @Override
            public String[] getCC() {
                //TODO
                return null;
            }

            @Override
            public String getFrom() {
                //TODO
                return null;
            }
        });
    }
}
