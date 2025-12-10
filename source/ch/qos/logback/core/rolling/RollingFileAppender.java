package ch.qos.logback.core.rolling;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.util.ContextUtil;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class RollingFileAppender<E> extends FileAppender<E> {

    /* renamed from: p */
    public static String f40031p = "http://logback.qos.ch/codes.html#rfa_no_tp";

    /* renamed from: q */
    public static String f40032q = "http://logback.qos.ch/codes.html#rfa_no_rp";

    /* renamed from: r */
    public static String f40033r = "http://logback.qos.ch/codes.html#rfa_collision";

    /* renamed from: s */
    public static String f40034s = "http://logback.qos.ch/codes.html#rfa_file_after";

    /* renamed from: t */
    public static String f40035t = "For more information, please visit ";

    /* renamed from: m */
    public File f40036m;

    /* renamed from: n */
    public TriggeringPolicy f40037n;

    /* renamed from: o */
    public RollingPolicy f40038o;

    @Override // ch.qos.logback.core.FileAppender
    public String getFile() {
        return this.f40038o.getActiveFileName();
    }

    public RollingPolicy getRollingPolicy() {
        return this.f40038o;
    }

    public TriggeringPolicy<E> getTriggeringPolicy() {
        return this.f40037n;
    }

    /* renamed from: j */
    public final void m51400j() {
        String activeFileName = this.f40038o.getActiveFileName();
        try {
            this.f40036m = new File(activeFileName);
            openFile(activeFileName);
        } catch (IOException e) {
            addError("setFile(" + activeFileName + ", false) call failed.", e);
        }
    }

    /* renamed from: k */
    public final void m51399k() {
        try {
            this.f40038o.rollover();
        } catch (RolloverFailure unused) {
            addWarn("RolloverFailure occurred. Deferring roll-over.");
            this.append = true;
        }
    }

    /* renamed from: l */
    public final boolean m51398l() {
        TriggeringPolicy triggeringPolicy = this.f40037n;
        return (triggeringPolicy instanceof RollingPolicyBase) && m51396n(((RollingPolicyBase) triggeringPolicy).f40039c);
    }

    /* renamed from: m */
    public final boolean m51397m() {
        FileNamePattern fileNamePattern;
        TriggeringPolicy triggeringPolicy = this.f40037n;
        if (!(triggeringPolicy instanceof RollingPolicyBase) || (fileNamePattern = ((RollingPolicyBase) triggeringPolicy).f40039c) == null || this.fileName == null) {
            return false;
        }
        return this.fileName.matches(fileNamePattern.toRegex());
    }

    /* renamed from: n */
    public final boolean m51396n(FileNamePattern fileNamePattern) {
        Map map = (Map) this.context.getObject(CoreConstants.RFA_FILENAME_PATTERN_COLLISION_MAP);
        boolean z = false;
        if (map == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (fileNamePattern.equals(entry.getValue())) {
                addErrorForCollision("FileNamePattern", ((FileNamePattern) entry.getValue()).toString(), (String) entry.getKey());
                z = true;
            }
        }
        if (this.name != null) {
            map.put(getName(), fileNamePattern);
        }
        return z;
    }

    public void rollover() {
        this.lock.lock();
        try {
            closeOutputStream();
            m51399k();
            m51400j();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // ch.qos.logback.core.FileAppender
    public void setFile(String str) {
        if (str != null && (this.f40037n != null || this.f40038o != null)) {
            addError("File property must be set before any triggeringPolicy or rollingPolicy properties");
            addError(f40035t + f40034s);
        }
        super.setFile(str);
    }

    public void setRollingPolicy(RollingPolicy rollingPolicy) {
        this.f40038o = rollingPolicy;
        if (rollingPolicy instanceof TriggeringPolicy) {
            this.f40037n = (TriggeringPolicy) rollingPolicy;
        }
    }

    public void setTriggeringPolicy(TriggeringPolicy<E> triggeringPolicy) {
        this.f40037n = triggeringPolicy;
        if (triggeringPolicy instanceof RollingPolicy) {
            this.f40038o = (RollingPolicy) triggeringPolicy;
        }
    }

    @Override // ch.qos.logback.core.FileAppender, ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        TriggeringPolicy triggeringPolicy = this.f40037n;
        if (triggeringPolicy == null) {
            addWarn("No TriggeringPolicy was set for the RollingFileAppender named " + getName());
            addWarn(f40035t + f40031p);
        } else if (!triggeringPolicy.isStarted()) {
            addWarn("TriggeringPolicy has not started. RollingFileAppender will not start");
        } else if (m51398l()) {
            addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
            addError(f40035t + FileAppender.COLLISION_WITH_EARLIER_APPENDER_URL);
        } else {
            if (!this.append) {
                addWarn("Append mode is mandatory for RollingFileAppender. Defaulting to append=true.");
                this.append = true;
            }
            if (this.f40038o == null) {
                addError("No RollingPolicy was set for the RollingFileAppender named " + getName());
                addError(f40035t + f40032q);
            } else if (m51397m()) {
                addError("File property collides with fileNamePattern. Aborting.");
                addError(f40035t + f40033r);
            } else {
                if (isPrudent()) {
                    if (rawFileProperty() != null) {
                        addWarn("Setting \"File\" property to null on account of prudent mode");
                        setFile(null);
                    }
                    if (this.f40038o.getCompressionMode() != CompressionMode.NONE) {
                        addError("Compression is not supported in prudent mode. Aborting");
                        return;
                    }
                }
                this.f40036m = new File(getFile());
                addInfo("Active log file name: " + getFile());
                super.start();
            }
        }
    }

    @Override // ch.qos.logback.core.FileAppender, ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        super.stop();
        RollingPolicy rollingPolicy = this.f40038o;
        if (rollingPolicy != null) {
            rollingPolicy.stop();
        }
        TriggeringPolicy triggeringPolicy = this.f40037n;
        if (triggeringPolicy != null) {
            triggeringPolicy.stop();
        }
        Map<String, FileNamePattern> filenamePatternCollisionMap = ContextUtil.getFilenamePatternCollisionMap(this.context);
        if (filenamePatternCollisionMap == null || getName() == null) {
            return;
        }
        filenamePatternCollisionMap.remove(getName());
    }

    @Override // ch.qos.logback.core.FileAppender, ch.qos.logback.core.OutputStreamAppender
    public void subAppend(E e) {
        synchronized (this.f40037n) {
            try {
                if (this.f40037n.isTriggeringEvent(this.f40036m, e)) {
                    rollover();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.subAppend(e);
    }
}
