package ch.qos.logback.core.rolling;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.spi.NoAutoStart;
import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.DefaultFileProvider;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.SizeAndTimeBasedArchiveRemover;
import ch.qos.logback.core.util.DefaultInvocationGate;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.InvocationGate;
import java.io.File;

@NoAutoStart
/* loaded from: classes.dex */
public class SizeAndTimeBasedFNATP<E> extends TimeBasedFileNamingAndTriggeringPolicyBase<E> {

    /* renamed from: h */
    public static String f40043h = "Missing integer token, that is %i, in FileNamePattern [";

    /* renamed from: i */
    public static String f40044i = "Missing date token, that is %d, in FileNamePattern [";

    /* renamed from: d */
    public int f40045d;

    /* renamed from: e */
    public FileSize f40046e;

    /* renamed from: f */
    public final Usage f40047f;

    /* renamed from: g */
    public InvocationGate f40048g;

    /* loaded from: classes.dex */
    public enum Usage {
        EMBEDDED,
        DIRECT
    }

    public SizeAndTimeBasedFNATP() {
        this(Usage.DIRECT);
    }

    /* renamed from: b */
    public void m51395b(String str) {
        File[] filesInFolderMatchingStemRegex = FileFilterUtil.filesInFolderMatchingStemRegex(new File(getCurrentPeriodsFileNameWithoutCompressionSuffix()).getParentFile(), str);
        if (filesInFolderMatchingStemRegex == null || filesInFolderMatchingStemRegex.length == 0) {
            this.f40045d = 0;
            return;
        }
        this.f40045d = FileFilterUtil.findHighestCounter(filesInFolderMatchingStemRegex, str);
        if (this.tbrp.getParentsRawFileProperty() == null && this.tbrp.compressionMode == CompressionMode.NONE) {
            return;
        }
        this.f40045d++;
    }

    public ArchiveRemover createArchiveRemover() {
        return new SizeAndTimeBasedArchiveRemover(this.tbrp.f40039c, this.f40053rc, new DefaultFileProvider());
    }

    /* renamed from: d */
    public final boolean m51394d() {
        boolean z;
        if (this.tbrp.f40039c.getIntegerTokenConverter() == null) {
            addError(f40043h + this.tbrp.fileNamePatternStr + "]");
            addError(CoreConstants.SEE_MISSING_INTEGER_TOKEN);
            z = true;
        } else {
            z = false;
        }
        if (this.tbrp.f40039c.getPrimaryDateTokenConverter() == null) {
            addError(f40044i + this.tbrp.fileNamePatternStr + "]");
            z = true;
        }
        return !z;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public String getCurrentPeriodsFileNameWithoutCompressionSuffix() {
        return this.tbrp.f40054g.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.f40045d));
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e) {
        String str;
        long currentTime = getCurrentTime();
        if (currentTime >= this.nextCheck) {
            this.elapsedPeriodsFileName = this.tbrp.f40054g.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.f40045d));
            this.f40045d = 0;
            setDateInCurrentPeriod(currentTime);
            computeNextCheck();
            return true;
        } else if (this.f40048g.isTooSoon(currentTime)) {
            return false;
        } else {
            if (file == null) {
                str = "activeFile == null";
            } else if (this.f40046e != null) {
                if (file.length() >= this.f40046e.getSize()) {
                    this.elapsedPeriodsFileName = this.tbrp.f40054g.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.f40045d));
                    this.f40045d++;
                    return true;
                }
                return false;
            } else {
                str = "maxFileSize = null";
            }
            addWarn(str);
            return false;
        }
    }

    public void setMaxFileSize(FileSize fileSize) {
        this.f40046e = fileSize;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        if (this.f40047f == Usage.DIRECT) {
            addWarn(CoreConstants.SIZE_AND_TIME_BASED_FNATP_IS_DEPRECATED);
            addWarn("For more information see http://logback.qos.ch/manual/appenders.html#SizeAndTimeBasedRollingPolicy");
        }
        if (super.isErrorFree()) {
            if (this.f40046e == null) {
                addError("maxFileSize property is mandatory.");
                withErrors();
            }
            if (!m51394d()) {
                withErrors();
                return;
            }
            ArchiveRemover createArchiveRemover = createArchiveRemover();
            this.archiveRemover = createArchiveRemover;
            createArchiveRemover.setContext(this.context);
            m51395b(FileFilterUtil.afterLastSlash(this.tbrp.f40039c.toRegexForFixedDate(this.dateInCurrentPeriod)));
            if (isErrorFree()) {
                this.started = true;
            }
        }
    }

    public SizeAndTimeBasedFNATP(Usage usage) {
        this.f40045d = 0;
        this.f40048g = new DefaultInvocationGate();
        this.f40047f = usage;
    }
}
