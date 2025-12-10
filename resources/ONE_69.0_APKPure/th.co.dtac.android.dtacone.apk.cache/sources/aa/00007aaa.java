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
    public static String f40029p = "http://logback.qos.ch/codes.html#rfa_no_tp";

    /* renamed from: q */
    public static String f40030q = "http://logback.qos.ch/codes.html#rfa_no_rp";

    /* renamed from: r */
    public static String f40031r = "http://logback.qos.ch/codes.html#rfa_collision";

    /* renamed from: s */
    public static String f40032s = "http://logback.qos.ch/codes.html#rfa_file_after";

    /* renamed from: t */
    public static String f40033t = "For more information, please visit ";

    /* renamed from: m */
    public File f40034m;

    /* renamed from: n */
    public TriggeringPolicy f40035n;

    /* renamed from: o */
    public RollingPolicy f40036o;

    @Override // ch.qos.logback.core.FileAppender
    public String getFile() {
        return this.f40036o.getActiveFileName();
    }

    public RollingPolicy getRollingPolicy() {
        return this.f40036o;
    }

    public TriggeringPolicy<E> getTriggeringPolicy() {
        return this.f40035n;
    }

    /* renamed from: j */
    public final void m51395j() {
        String activeFileName = this.f40036o.getActiveFileName();
        try {
            this.f40034m = new File(activeFileName);
            openFile(activeFileName);
        } catch (IOException e) {
            addError("setFile(" + activeFileName + ", false) call failed.", e);
        }
    }

    /* renamed from: k */
    public final void m51394k() {
        try {
            this.f40036o.rollover();
        } catch (RolloverFailure unused) {
            addWarn("RolloverFailure occurred. Deferring roll-over.");
            this.append = true;
        }
    }

    /* renamed from: l */
    public final boolean m51393l() {
        TriggeringPolicy triggeringPolicy = this.f40035n;
        return (triggeringPolicy instanceof RollingPolicyBase) && m51391n(((RollingPolicyBase) triggeringPolicy).f40037c);
    }

    /* renamed from: m */
    public final boolean m51392m() {
        FileNamePattern fileNamePattern;
        TriggeringPolicy triggeringPolicy = this.f40035n;
        if (!(triggeringPolicy instanceof RollingPolicyBase) || (fileNamePattern = ((RollingPolicyBase) triggeringPolicy).f40037c) == null || this.fileName == null) {
            return false;
        }
        return this.fileName.matches(fileNamePattern.toRegex());
    }

    /* renamed from: n */
    public final boolean m51391n(FileNamePattern fileNamePattern) {
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
            m51394k();
            m51395j();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // ch.qos.logback.core.FileAppender
    public void setFile(String str) {
        if (str != null && (this.f40035n != null || this.f40036o != null)) {
            addError("File property must be set before any triggeringPolicy or rollingPolicy properties");
            addError(f40033t + f40032s);
        }
        super.setFile(str);
    }

    public void setRollingPolicy(RollingPolicy rollingPolicy) {
        this.f40036o = rollingPolicy;
        if (rollingPolicy instanceof TriggeringPolicy) {
            this.f40035n = (TriggeringPolicy) rollingPolicy;
        }
    }

    public void setTriggeringPolicy(TriggeringPolicy<E> triggeringPolicy) {
        this.f40035n = triggeringPolicy;
        if (triggeringPolicy instanceof RollingPolicy) {
            this.f40036o = (RollingPolicy) triggeringPolicy;
        }
    }

    @Override // ch.qos.logback.core.FileAppender, ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        TriggeringPolicy triggeringPolicy = this.f40035n;
        if (triggeringPolicy == null) {
            addWarn("No TriggeringPolicy was set for the RollingFileAppender named " + getName());
            addWarn(f40033t + f40029p);
        } else if (!triggeringPolicy.isStarted()) {
            addWarn("TriggeringPolicy has not started. RollingFileAppender will not start");
        } else if (m51393l()) {
            addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
            addError(f40033t + FileAppender.COLLISION_WITH_EARLIER_APPENDER_URL);
        } else {
            if (!this.append) {
                addWarn("Append mode is mandatory for RollingFileAppender. Defaulting to append=true.");
                this.append = true;
            }
            if (this.f40036o == null) {
                addError("No RollingPolicy was set for the RollingFileAppender named " + getName());
                addError(f40033t + f40030q);
            } else if (m51392m()) {
                addError("File property collides with fileNamePattern. Aborting.");
                addError(f40033t + f40031r);
            } else {
                if (isPrudent()) {
                    if (rawFileProperty() != null) {
                        addWarn("Setting \"File\" property to null on account of prudent mode");
                        setFile(null);
                    }
                    if (this.f40036o.getCompressionMode() != CompressionMode.NONE) {
                        addError("Compression is not supported in prudent mode. Aborting");
                        return;
                    }
                }
                this.f40034m = new File(getFile());
                addInfo("Active log file name: " + getFile());
                super.start();
            }
        }
    }

    @Override // ch.qos.logback.core.FileAppender, ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        super.stop();
        RollingPolicy rollingPolicy = this.f40036o;
        if (rollingPolicy != null) {
            rollingPolicy.stop();
        }
        TriggeringPolicy triggeringPolicy = this.f40035n;
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
        synchronized (this.f40035n) {
            try {
                if (this.f40035n.isTriggeringEvent(this.f40034m, e)) {
                    rollover();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.subAppend(e);
    }
}