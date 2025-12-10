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
    public final ClassLoader f39688a = Loader.getClassLoaderOfObject(this);

    /* renamed from: b */
    public final LoggerContext f39689b;

    public ContextInitializer(LoggerContext loggerContext) {
        this.f39689b = loggerContext;
    }

    /* renamed from: a */
    public final URL m51559a(boolean z) {
        URL url;
        String systemProperty = OptionHelper.getSystemProperty(CONFIG_FILE_PROPERTY);
        try {
            if (systemProperty != null) {
                try {
                    File file = new File(systemProperty);
                    if (file.exists() && file.isFile()) {
                        if (z) {
                            m51556d(systemProperty, this.f39688a, systemProperty);
                        }
                        url = file.toURI().toURL();
                    } else {
                        url = new URL(systemProperty);
                    }
                    if (z) {
                        m51556d(systemProperty, this.f39688a, url != null ? url.toString() : null);
                    }
                    return url;
                } catch (MalformedURLException unused) {
                    URL resource = Loader.getResource(systemProperty, this.f39688a);
                    if (resource != null) {
                        if (z) {
                            m51556d(systemProperty, this.f39688a, resource.toString());
                        }
                        return resource;
                    } else if (z) {
                        m51556d(systemProperty, this.f39688a, resource != null ? resource.toString() : null);
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            if (z) {
                m51556d(systemProperty, this.f39688a, null);
            }
            throw th2;
        }
    }

    public void autoConfig() throws JoranException {
        StatusListenerConfigHelper.installIfAsked(this.f39689b);
        new AndroidContextUtil().setupProperties(this.f39689b);
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        joranConfigurator.setContext(this.f39689b);
        URL m51559a = m51559a(true);
        if (m51559a != null) {
            joranConfigurator.doConfigure(m51559a);
            return;
        }
        URL m51558b = m51558b(true);
        if (m51558b != null) {
            joranConfigurator.doConfigure(m51558b);
        }
    }

    /* renamed from: b */
    public final URL m51558b(boolean z) {
        return m51557c(AUTOCONFIG_FILE, this.f39688a, z);
    }

    /* renamed from: c */
    public final URL m51557c(String str, ClassLoader classLoader, boolean z) {
        URL resource = classLoader.getResource(str);
        if (z) {
            m51556d(str, classLoader, resource != null ? str : null);
        }
        return resource;
    }

    /* renamed from: d */
    public final void m51556d(String str, ClassLoader classLoader, String str2) {
        StatusManager statusManager = this.f39689b.getStatusManager();
        if (str2 == null) {
            statusManager.add(new InfoStatus("Could NOT find resource [" + str + "]", this.f39689b));
            return;
        }
        statusManager.add(new InfoStatus("Found resource [" + str + "] at [" + str2 + "]", this.f39689b));
    }
}
