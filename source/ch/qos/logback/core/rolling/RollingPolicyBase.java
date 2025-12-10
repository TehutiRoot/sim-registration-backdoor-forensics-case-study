package ch.qos.logback.core.rolling;

import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.spi.ContextAwareBase;

/* loaded from: classes.dex */
public abstract class RollingPolicyBase extends ContextAwareBase implements RollingPolicy {

    /* renamed from: c */
    public FileNamePattern f40039c;
    protected CompressionMode compressionMode = CompressionMode.NONE;

    /* renamed from: d */
    public FileAppender f40040d;

    /* renamed from: e */
    public FileNamePattern f40041e;

    /* renamed from: f */
    public boolean f40042f;
    protected String fileNamePatternStr;

    public void determineCompressionMode() {
        CompressionMode compressionMode;
        if (this.fileNamePatternStr.endsWith(".gz")) {
            addInfo("Will use gz compression");
            compressionMode = CompressionMode.GZ;
        } else if (this.fileNamePatternStr.endsWith(".zip")) {
            addInfo("Will use zip compression");
            compressionMode = CompressionMode.ZIP;
        } else {
            addInfo("No compression will be used");
            compressionMode = CompressionMode.NONE;
        }
        this.compressionMode = compressionMode;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public CompressionMode getCompressionMode() {
        return this.compressionMode;
    }

    public String getFileNamePattern() {
        return this.fileNamePatternStr;
    }

    public String getParentsRawFileProperty() {
        return this.f40040d.rawFileProperty();
    }

    public boolean isParentPrudent() {
        return this.f40040d.isPrudent();
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.f40042f;
    }

    public void setFileNamePattern(String str) {
        this.fileNamePatternStr = str;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public void setParent(FileAppender<?> fileAppender) {
        this.f40040d = fileAppender;
    }

    public void start() {
        this.f40042f = true;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f40042f = false;
    }
}
