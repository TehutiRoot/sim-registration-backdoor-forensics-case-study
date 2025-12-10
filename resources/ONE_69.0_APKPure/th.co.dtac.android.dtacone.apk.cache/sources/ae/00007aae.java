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
    public static String f40041h = "Missing integer token, that is %i, in FileNamePattern [";

    /* renamed from: i */
    public static String f40042i = "Missing date token, that is %d, in FileNamePattern [";

    /* renamed from: d */
    public int f40043d;

    /* renamed from: e */
    public FileSize f40044e;

    /* renamed from: f */
    public final Usage f40045f;

    /* renamed from: g */
    public InvocationGate f40046g;

    /* loaded from: classes.dex */
    public enum Usage {
        EMBEDDED,
        DIRECT
    }

    public SizeAndTimeBasedFNATP() {
        this(Usage.DIRECT);
    }

    /* renamed from: b */
    public void m51390b(String str) {
        File[] filesInFolderMatchingStemRegex = FileFilterUtil.filesInFolderMatchingStemRegex(new File(getCurrentPeriodsFileNameWithoutCompressionSuffix()).getParentFile(), str);
        if (filesInFolderMatchingStemRegex == null || filesInFolderMatchingStemRegex.length == 0) {
            this.f40043d = 0;
            return;
        }
        this.f40043d = FileFilterUtil.findHighestCounter(filesInFolderMatchingStemRegex, str);
        if (this.tbrp.getParentsRawFileProperty() == null && this.tbrp.compressionMode == CompressionMode.NONE) {
            return;
        }
        this.f40043d++;
    }

    public ArchiveRemover createArchiveRemover() {
        return new SizeAndTimeBasedArchiveRemover(this.tbrp.f40037c, this.f40051rc, new DefaultFileProvider());
    }

    /* renamed from: d */
    public final boolean m51389d() {
        boolean z;
        if (this.tbrp.f40037c.getIntegerTokenConverter() == null) {
            addError(f40041h + this.tbrp.fileNamePatternStr + "]");
            addError(CoreConstants.SEE_MISSING_INTEGER_TOKEN);
            z = true;
        } else {
            z = false;
        }
        if (this.tbrp.f40037c.getPrimaryDateTokenConverter() == null) {
            addError(f40042i + this.tbrp.fileNamePatternStr + "]");
            z = true;
        }
        return !z;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public String getCurrentPeriodsFileNameWithoutCompressionSuffix() {
        return this.tbrp.f40052g.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.f40043d));
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e) {
        String str;
        long currentTime = getCurrentTime();
        if (currentTime >= this.nextCheck) {
            this.elapsedPeriodsFileName = this.tbrp.f40052g.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.f40043d));
            this.f40043d = 0;
            setDateInCurrentPeriod(currentTime);
            computeNextCheck();
            return true;
        } else if (this.f40046g.isTooSoon(currentTime)) {
            return false;
        } else {
            if (file == null) {
                str = "activeFile == null";
            } else if (this.f40044e != null) {
                if (file.length() >= this.f40044e.getSize()) {
                    this.elapsedPeriodsFileName = this.tbrp.f40052g.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.f40043d));
                    this.f40043d++;
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
        this.f40044e = fileSize;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        if (this.f40045f == Usage.DIRECT) {
            addWarn(CoreConstants.SIZE_AND_TIME_BASED_FNATP_IS_DEPRECATED);
            addWarn("For more information see http://logback.qos.ch/manual/appenders.html#SizeAndTimeBasedRollingPolicy");
        }
        if (super.isErrorFree()) {
            if (this.f40044e == null) {
                addError("maxFileSize property is mandatory.");
                withErrors();
            }
            if (!m51389d()) {
                withErrors();
                return;
            }
            ArchiveRemover createArchiveRemover = createArchiveRemover();
            this.archiveRemover = createArchiveRemover;
            createArchiveRemover.setContext(this.context);
            m51390b(FileFilterUtil.afterLastSlash(this.tbrp.f40037c.toRegexForFixedDate(this.dateInCurrentPeriod)));
            if (isErrorFree()) {
                this.started = true;
            }
        }
    }

    public SizeAndTimeBasedFNATP(Usage usage) {
        this.f40043d = 0;
        this.f40046g = new DefaultInvocationGate();
        this.f40045f = usage;
    }
}