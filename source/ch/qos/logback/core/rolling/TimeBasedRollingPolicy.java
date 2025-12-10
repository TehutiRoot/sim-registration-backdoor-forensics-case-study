package ch.qos.logback.core.rolling;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.RenameUtil;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class TimeBasedRollingPolicy<E> extends RollingPolicyBase implements TriggeringPolicy<E> {

    /* renamed from: g */
    public FileNamePattern f40054g;

    /* renamed from: h */
    public Compressor f40055h;

    /* renamed from: j */
    public Future f40057j;

    /* renamed from: k */
    public Future f40058k;

    /* renamed from: m */
    public ArchiveRemover f40060m;

    /* renamed from: n */
    public TimeBasedFileNamingAndTriggeringPolicy f40061n;

    /* renamed from: i */
    public RenameUtil f40056i = new RenameUtil();

    /* renamed from: l */
    public int f40059l = 0;
    protected FileSize totalSizeCap = new FileSize(0);

    /* renamed from: o */
    public boolean f40062o = false;

    /* renamed from: b */
    public Future m51393b(String str, String str2) {
        String str3 = str + System.nanoTime() + ".tmp";
        this.f40056i.rename(getParentsRawFileProperty(), str3);
        return this.f40055h.asyncCompress(str3, str, str2);
    }

    /* renamed from: d */
    public final String m51392d(String str) {
        return FileFilterUtil.afterLastSlash(FileFilterUtil.slashify(str));
    }

    /* renamed from: g */
    public final void m51391g(Future future, String str) {
        StringBuilder sb;
        String str2;
        if (future != null) {
            try {
                future.get(30L, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                e = e;
                sb = new StringBuilder();
                str2 = "Timeout while waiting for ";
                sb.append(str2);
                sb.append(str);
                sb.append(" job to finish");
                addError(sb.toString(), e);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str2 = "Unexpected exception while waiting for ";
                sb.append(str2);
                sb.append(str);
                sb.append(" job to finish");
                addError(sb.toString(), e);
            }
        }
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public String getActiveFileName() {
        String parentsRawFileProperty = getParentsRawFileProperty();
        return parentsRawFileProperty != null ? parentsRawFileProperty : this.f40061n.getCurrentPeriodsFileNameWithoutCompressionSuffix();
    }

    public int getMaxHistory() {
        return this.f40059l;
    }

    public TimeBasedFileNamingAndTriggeringPolicy<E> getTimeBasedFileNamingAndTriggeringPolicy() {
        return this.f40061n;
    }

    public boolean isCleanHistoryOnStart() {
        return this.f40062o;
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e) {
        return this.f40061n.isTriggeringEvent(file, e);
    }

    public boolean isUnboundedTotalSizeCap() {
        return this.totalSizeCap.getSize() == 0;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public void rollover() throws RolloverFailure {
        String elapsedPeriodsFileName = this.f40061n.getElapsedPeriodsFileName();
        String afterLastSlash = FileFilterUtil.afterLastSlash(elapsedPeriodsFileName);
        if (this.compressionMode != CompressionMode.NONE) {
            this.f40057j = getParentsRawFileProperty() == null ? this.f40055h.asyncCompress(elapsedPeriodsFileName, elapsedPeriodsFileName, afterLastSlash) : m51393b(elapsedPeriodsFileName, afterLastSlash);
        } else if (getParentsRawFileProperty() != null) {
            this.f40056i.rename(getParentsRawFileProperty(), elapsedPeriodsFileName);
        }
        if (this.f40060m != null) {
            this.f40058k = this.f40060m.cleanAsynchronously(new Date(this.f40061n.getCurrentTime()));
        }
    }

    public void setCleanHistoryOnStart(boolean z) {
        this.f40062o = z;
    }

    public void setMaxHistory(int i) {
        this.f40059l = i;
    }

    public void setTimeBasedFileNamingAndTriggeringPolicy(TimeBasedFileNamingAndTriggeringPolicy<E> timeBasedFileNamingAndTriggeringPolicy) {
        this.f40061n = timeBasedFileNamingAndTriggeringPolicy;
    }

    public void setTotalSizeCap(FileSize fileSize) {
        addInfo("setting totalSizeCap to " + fileSize.toString());
        this.totalSizeCap = fileSize;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f40056i.setContext(this.context);
        if (this.fileNamePatternStr == null) {
            addWarn("The FileNamePattern option must be set before using TimeBasedRollingPolicy. ");
            addWarn(CoreConstants.SEE_FNP_NOT_SET);
            throw new IllegalStateException("The FileNamePattern option must be set before using TimeBasedRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
        }
        this.f40039c = new FileNamePattern(this.fileNamePatternStr, this.context);
        determineCompressionMode();
        Compressor compressor = new Compressor(this.compressionMode);
        this.f40055h = compressor;
        compressor.setContext(this.context);
        this.f40054g = new FileNamePattern(Compressor.computeFileNameStrWithoutCompSuffix(this.fileNamePatternStr, this.compressionMode), this.context);
        addInfo("Will use the pattern " + this.f40054g + " for the active file");
        if (this.compressionMode == CompressionMode.ZIP) {
            this.f40041e = new FileNamePattern(m51392d(this.fileNamePatternStr), this.context);
        }
        if (this.f40061n == null) {
            this.f40061n = new DefaultTimeBasedFileNamingAndTriggeringPolicy();
        }
        this.f40061n.setContext(this.context);
        this.f40061n.setTimeBasedRollingPolicy(this);
        this.f40061n.start();
        if (!this.f40061n.isStarted()) {
            addWarn("Subcomponent did not start. TimeBasedRollingPolicy will not start.");
            return;
        }
        if (this.f40059l != 0) {
            ArchiveRemover archiveRemover = this.f40061n.getArchiveRemover();
            this.f40060m = archiveRemover;
            archiveRemover.setMaxHistory(this.f40059l);
            this.f40060m.setTotalSizeCap(this.totalSizeCap.getSize());
            if (this.f40062o) {
                addInfo("Cleaning on start up");
                this.f40058k = this.f40060m.cleanAsynchronously(new Date(this.f40061n.getCurrentTime()));
            }
        } else if (!isUnboundedTotalSizeCap()) {
            addWarn("'maxHistory' is not set, ignoring 'totalSizeCap' option with value [" + this.totalSizeCap + "]");
        }
        super.start();
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            m51391g(this.f40057j, "compression");
            m51391g(this.f40058k, "clean-up");
            super.stop();
        }
    }

    public String toString() {
        return "c.q.l.core.rolling.TimeBasedRollingPolicy@" + hashCode();
    }
}
