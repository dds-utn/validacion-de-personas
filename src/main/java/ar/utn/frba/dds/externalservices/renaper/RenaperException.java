package ar.utn.frba.dds.externalservices.renaper;

import ar.utn.frba.dds.utils.ICustomException;

public class RenaperException extends RuntimeException implements ICustomException {


    @Override
    public String getCustomMessage() {
        return super.getMessage();
    }

    @Override
    public String getCustomStackTrace() {
        return super.getStackTrace().toString();
    }
}
