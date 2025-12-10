package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StatusListenerConfigHelper;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public class ContextInitializer {
    public static final String AUTOCONFIG_FILE = "assets/logback.xml";
    public static final String CONFIG_FILE_PROPERTY = "logback.configurationFile";

    /* renamed from: a */
    public final ClassLoader f39686a = Loader.getClassLoaderOfObject(this);

    /* renamed from: b */
    public final LoggerContext f39687b;

    public ContextInitializer(LoggerContext loggerContext) {
        this.f39687b = loggerContext;
    }

    /* renamed from: a */
    public final URL m51554a(boolean z) {
        URL url;
        String systemProperty = OptionHelper.getSystemProperty(CONFIG_FILE_PROPERTY);
        try {
            if (systemProperty != null) {
                try {
                    File file = new File(systemProperty);
                    if (file.exists() && file.isFile()) {
                        if (z) {
                            m51551d(systemProperty, this.f39686a, systemProperty);
                        }
                        url = file.toURI().toURL();
                    } else {
                        url = new URL(systemProperty);
                    }
                    if (z) {
                        m51551d(systemProperty, this.f39686a, url != null ? url.toString() : null);
                    }
                    return url;
                } catch (MalformedURLException unused) {
                    URL resource = Loader.getResource(systemProperty, this.f39686a);
                    if (resource != null) {
                        if (z) {
                            m51551d(systemProperty, this.f39686a, resource.toString());
                        }
                        return resource;
                    } else if (z) {
                        m51551d(systemProperty, this.f39686a, resource != null ? resource.toString() : null);
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            if (z) {
                m51551d(systemProperty, this.f39686a, null);
            }
            throw th2;
        }
    }

    public void autoConfig() throws JoranException {
        StatusListenerConfigHelper.installIfAsked(this.f39687b);
        new AndroidContextUtil().setupProperties(this.f39687b);
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        joranConfigurator.setContext(this.f39687b);
        URL m51554a = m51554a(true);
        if (m51554a != null) {
            joranConfigurator.doConfigure(m51554a);
            return;
        }
        URL m51553b = m51553b(true);
        if (m51553b != null) {
            joranConfigurator.doConfigure(m51553b);
        }
    }

    /* renamed from: b */
    public final URL m51553b(boolean z) {
        return m51552c(AUTOCONFIG_FILE, this.f39686a, z);
    }

    /* renamed from: c */
    public final URL m51552c(String str, ClassLoader classLoader, boolean z) {
        URL resource = classLoader.getResource(str);
        if (z) {
            m51551d(str, classLoader, resource != null ? str : null);
        }
        return resource;
    }

    /* renamed from: d */
    public final void m51551d(String str, ClassLoader classLoader, String str2) {
        StatusManager statusManager = this.f39687b.getStatusManager();
        if (str2 == null) {
            statusManager.add(new InfoStatus("Could NOT find resource [" + str + "]", this.f39687b));
            return;
        }
        statusManager.add(new InfoStatus("Found resource [" + str + "] at [" + str2 + "]", this.f39687b));
    }
}