package ch.qos.logback.core.net.ssl;

/* loaded from: classes.dex */
public class SSLConfiguration extends SSLContextFactoryBean {

    /* renamed from: h */
    public SSLParametersConfiguration f39945h;

    public SSLParametersConfiguration getParameters() {
        if (this.f39945h == null) {
            this.f39945h = new SSLParametersConfiguration();
        }
        return this.f39945h;
    }

    public void setParameters(SSLParametersConfiguration sSLParametersConfiguration) {
        this.f39945h = sSLParametersConfiguration;
    }
}