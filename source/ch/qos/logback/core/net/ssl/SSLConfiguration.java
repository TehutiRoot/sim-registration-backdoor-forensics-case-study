package ch.qos.logback.core.net.ssl;

/* loaded from: classes.dex */
public class SSLConfiguration extends SSLContextFactoryBean {

    /* renamed from: h */
    public SSLParametersConfiguration f39947h;

    public SSLParametersConfiguration getParameters() {
        if (this.f39947h == null) {
            this.f39947h = new SSLParametersConfiguration();
        }
        return this.f39947h;
    }

    public void setParameters(SSLParametersConfiguration sSLParametersConfiguration) {
        this.f39947h = sSLParametersConfiguration;
    }
}
