package ru.murat.dautov.helloCommand;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloCommandActivator implements BundleActivator {

    public void start(BundleContext context) {
        context.registerService(
                HelloCommand.class.getName(),
                new HelloCommand(), null);
    }

    public void stop(BundleContext context) {
    }
}