package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.ReconfigureOnChangeTask;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.Duration;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StatusListenerConfigHelper;
import java.net.URL;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class ConfigurationAction extends Action {

    /* renamed from: c */
    public static final Duration f39546c = Duration.buildByMinutes(1.0d);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [ch.qos.logback.core.util.Duration] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ch.qos.logback.core.util.Duration] */
    /* renamed from: b */
    public final Duration m51616b(String str, Duration duration) {
        Throwable th2;
        Throwable th3 = null;
        if (!OptionHelper.isEmpty(str)) {
            try {
                th2 = Duration.valueOf(str);
            } catch (IllegalArgumentException | IllegalStateException e) {
                th3 = e;
                th2 = null;
            }
            if (th3 != null) {
                addWarn("Failed to parse 'scanPeriod' attribute [" + str + "]", th3);
            }
            th3 = th2;
        }
        if (th3 == null) {
            addInfo("No 'scanPeriod' specified. Defaulting to " + duration.toString());
            return duration;
        }
        return th3;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String systemProperty = OptionHelper.getSystemProperty("logback.debug");
        if (systemProperty == null) {
            systemProperty = interpretationContext.subst(attributes.getValue("debug"));
        }
        if (OptionHelper.isEmpty(systemProperty) || systemProperty.equalsIgnoreCase("false") || systemProperty.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
            addInfo("debug attribute not set");
        } else {
            StatusListenerConfigHelper.addOnConsoleListenerInstance(this.context, new OnConsoleStatusListener());
        }
        m51615d(interpretationContext, attributes);
        new ContextUtil(this.context).addHostNameAsProperty();
        interpretationContext.pushObject(getContext());
        ((LoggerContext) this.context).setPackagingDataEnabled(OptionHelper.toBoolean(interpretationContext.subst(attributes.getValue("packagingData")), false));
    }

    /* renamed from: d */
    public void m51615d(InterpretationContext interpretationContext, Attributes attributes) {
        String subst = interpretationContext.subst(attributes.getValue("scan"));
        if (OptionHelper.isEmpty(subst) || "false".equalsIgnoreCase(subst)) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.context.getScheduledExecutorService();
        URL mainWatchURL = ConfigurationWatchListUtil.getMainWatchURL(this.context);
        if (mainWatchURL == null) {
            addWarn("Due to missing top level configuration file, reconfiguration on change (configuration file scanning) cannot be done.");
            return;
        }
        ReconfigureOnChangeTask reconfigureOnChangeTask = new ReconfigureOnChangeTask();
        reconfigureOnChangeTask.setContext(this.context);
        this.context.putObject(CoreConstants.RECONFIGURE_ON_CHANGE_TASK, reconfigureOnChangeTask);
        Duration m51616b = m51616b(interpretationContext.subst(attributes.getValue("scanPeriod")), f39546c);
        addInfo("Will scan for changes in [" + mainWatchURL + "] ");
        StringBuilder sb = new StringBuilder();
        sb.append("Setting ReconfigureOnChangeTask scanning period to ");
        sb.append(m51616b);
        addInfo(sb.toString());
        this.context.addScheduledFuture(scheduledExecutorService.scheduleAtFixedRate(reconfigureOnChangeTask, m51616b.getMilliseconds(), m51616b.getMilliseconds(), TimeUnit.MILLISECONDS));
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        addInfo("End of configuration.");
        interpretationContext.popObject();
    }
}
