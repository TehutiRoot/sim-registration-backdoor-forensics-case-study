package ch.qos.logback.classic.joran;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.StatusUtil;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ReconfigureOnChangeTask extends ContextAwareBase implements Runnable {
    public static final String DETECTED_CHANGE_IN_CONFIGURATION_FILES = "Detected change in configuration files.";

    /* renamed from: c */
    public long f39540c = System.currentTimeMillis();

    /* renamed from: d */
    public List f39541d;

    /* renamed from: b */
    public final void m51624b(LoggerContext loggerContext, List list, URL url) {
        List<SaxEvent> m51619k = m51619k(list);
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        joranConfigurator.setContext(this.context);
        ConfigurationWatchList buildClone = ConfigurationWatchListUtil.getConfigurationWatchList(this.context).buildClone();
        if (m51619k == null || m51619k.isEmpty()) {
            addWarn("No previous configuration to fall back on.");
            return;
        }
        addWarn("Given previous errors, falling back to previously registered safe configuration.");
        try {
            loggerContext.reset();
            ConfigurationWatchListUtil.registerConfigurationWatchList(this.context, buildClone);
            joranConfigurator.doConfigure(m51619k);
            addInfo("Re-registering previous fallback configuration once more as a fallback configuration point");
            joranConfigurator.registerSafeConfiguration(list);
            addInfo("after registerSafeConfiguration: " + list);
        } catch (JoranException e) {
            addError("Unexpected exception thrown by a configuration considered safe.", e);
        }
    }

    /* renamed from: d */
    public final void m51623d() {
        List<ReconfigureOnChangeTaskListener> list = this.f39541d;
        if (list == null) {
            return;
        }
        for (ReconfigureOnChangeTaskListener reconfigureOnChangeTaskListener : list) {
            reconfigureOnChangeTaskListener.m51618a();
        }
    }

    /* renamed from: g */
    public final void m51622g() {
        List<ReconfigureOnChangeTaskListener> list = this.f39541d;
        if (list == null) {
            return;
        }
        for (ReconfigureOnChangeTaskListener reconfigureOnChangeTaskListener : list) {
            reconfigureOnChangeTaskListener.m51617b();
        }
    }

    /* renamed from: i */
    public final void m51621i() {
        List<ReconfigureOnChangeTaskListener> list = this.f39541d;
        if (list == null) {
            return;
        }
        for (ReconfigureOnChangeTaskListener reconfigureOnChangeTaskListener : list) {
            reconfigureOnChangeTaskListener.m51616c();
        }
    }

    /* renamed from: j */
    public final void m51620j(LoggerContext loggerContext, URL url) {
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        joranConfigurator.setContext(this.context);
        StatusUtil statusUtil = new StatusUtil(this.context);
        List<SaxEvent> recallSafeConfiguration = joranConfigurator.recallSafeConfiguration();
        URL mainWatchURL = ConfigurationWatchListUtil.getMainWatchURL(this.context);
        loggerContext.reset();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            joranConfigurator.doConfigure(url);
            if (statusUtil.hasXMLParsingErrors(currentTimeMillis)) {
                m51624b(loggerContext, recallSafeConfiguration, mainWatchURL);
            }
        } catch (JoranException unused) {
            m51624b(loggerContext, recallSafeConfiguration, mainWatchURL);
        }
    }

    /* renamed from: k */
    public final List m51619k(List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SaxEvent saxEvent = (SaxEvent) it.next();
            if (!"include".equalsIgnoreCase(saxEvent.getLocalName())) {
                arrayList.add(saxEvent);
            }
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        m51621i();
        ConfigurationWatchList configurationWatchList = ConfigurationWatchListUtil.getConfigurationWatchList(this.context);
        if (configurationWatchList == null) {
            addWarn("Empty ConfigurationWatchList in context");
            return;
        }
        List<File> copyOfFileWatchList = configurationWatchList.getCopyOfFileWatchList();
        if (copyOfFileWatchList == null || copyOfFileWatchList.isEmpty()) {
            addInfo("Empty watch file list. Disabling ");
        } else if (configurationWatchList.changeDetected()) {
            m51623d();
            URL mainURL = configurationWatchList.getMainURL();
            addInfo(DETECTED_CHANGE_IN_CONFIGURATION_FILES);
            addInfo("Will reset and reconfigure context named [" + this.context.getName() + "]");
            LoggerContext loggerContext = (LoggerContext) this.context;
            if (mainURL.toString().endsWith("xml")) {
                m51620j(loggerContext, mainURL);
            } else if (mainURL.toString().endsWith("groovy")) {
                addError("Groovy classes are not available on the class path. ABORTING INITIALIZATION.");
            }
            m51622g();
        }
    }

    public String toString() {
        return "ReconfigureOnChangeTask(born:" + this.f39540c + ")";
    }
}