package ch.qos.logback.classic.net;

import ch.qos.logback.core.net.ssl.ConfigurableSSLSocketFactory;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

/* loaded from: classes.dex */
public class SSLSocketReceiver extends SocketReceiver implements SSLComponent {

    /* renamed from: l */
    public SSLConfiguration f39568l;

    /* renamed from: m */
    public SocketFactory f39569m;

    @Override // ch.qos.logback.classic.net.SocketReceiver
    public SocketFactory getSocketFactory() {
        return this.f39569m;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public SSLConfiguration getSsl() {
        if (this.f39568l == null) {
            this.f39568l = new SSLConfiguration();
        }
        return this.f39568l;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public void setSsl(SSLConfiguration sSLConfiguration) {
        this.f39568l = sSLConfiguration;
    }

    @Override // ch.qos.logback.classic.net.SocketReceiver, ch.qos.logback.classic.net.ReceiverBase
    public boolean shouldStart() {
        try {
            SSLContext createContext = getSsl().createContext(this);
            SSLParametersConfiguration parameters = getSsl().getParameters();
            parameters.setContext(getContext());
            this.f39569m = new ConfigurableSSLSocketFactory(parameters, createContext.getSocketFactory());
            return super.shouldStart();
        } catch (Exception e) {
            addError(e.getMessage(), e);
            return false;
        }
    }
}
