package ch.qos.logback.core.rolling;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.RenameUtil;
import java.io.File;
import java.util.Date;

/* loaded from: classes.dex */
public class FixedWindowRollingPolicy extends RollingPolicyBase {
    public static final String ZIP_ENTRY_DATE_PATTERN = "yyyy-MM-dd_HHmm";

    /* renamed from: k */
    public static int f40023k = 20;

    /* renamed from: j */
    public Compressor f40027j;

    /* renamed from: i */
    public RenameUtil f40026i = new RenameUtil();

    /* renamed from: h */
    public int f40025h = 1;

    /* renamed from: g */
    public int f40024g = 7;

    /* renamed from: ch.qos.logback.core.rolling.FixedWindowRollingPolicy$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5474a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40028a;

        static {
            int[] iArr = new int[CompressionMode.values().length];
            f40028a = iArr;
            try {
                iArr[CompressionMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40028a[CompressionMode.GZ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40028a[CompressionMode.ZIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: b */
    public final String m51396b(String str) {
        return FileFilterUtil.afterLastSlash(FileFilterUtil.slashify(str)).replace("%i", "%d{yyyy-MM-dd_HHmm}");
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public String getActiveFileName() {
        return getParentsRawFileProperty();
    }

    public int getMaxIndex() {
        return this.f40024g;
    }

    public int getMaxWindowSize() {
        return f40023k;
    }

    public int getMinIndex() {
        return this.f40025h;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public void rollover() throws RolloverFailure {
        Compressor compressor;
        String activeFileName;
        String convertInt;
        String str;
        if (this.f40024g >= 0) {
            File file = new File(this.f40037c.convertInt(this.f40024g));
            if (file.exists()) {
                file.delete();
            }
            for (int i = this.f40024g - 1; i >= this.f40025h; i--) {
                String convertInt2 = this.f40037c.convertInt(i);
                if (new File(convertInt2).exists()) {
                    this.f40026i.rename(convertInt2, this.f40037c.convertInt(i + 1));
                } else {
                    addInfo("Skipping roll-over for inexistent file " + convertInt2);
                }
            }
            int i2 = C5474a.f40028a[this.compressionMode.ordinal()];
            if (i2 == 1) {
                this.f40026i.rename(getActiveFileName(), this.f40037c.convertInt(this.f40025h));
                return;
            }
            if (i2 == 2) {
                compressor = this.f40027j;
                activeFileName = getActiveFileName();
                convertInt = this.f40037c.convertInt(this.f40025h);
                str = null;
            } else if (i2 != 3) {
                return;
            } else {
                compressor = this.f40027j;
                activeFileName = getActiveFileName();
                convertInt = this.f40037c.convertInt(this.f40025h);
                str = this.f40039e.convert(new Date());
            }
            compressor.compress(activeFileName, convertInt, str);
        }
    }

    public void setMaxIndex(int i) {
        this.f40024g = i;
    }

    public void setMinIndex(int i) {
        this.f40025h = i;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f40026i.setContext(this.context);
        if (this.fileNamePatternStr == null) {
            addError("The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. ");
            addError(CoreConstants.SEE_FNP_NOT_SET);
            throw new IllegalStateException("The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
        }
        this.f40037c = new FileNamePattern(this.fileNamePatternStr, this.context);
        determineCompressionMode();
        if (isParentPrudent()) {
            addError("Prudent mode is not supported with FixedWindowRollingPolicy.");
            addError("See also http://logback.qos.ch/codes.html#tbr_fnp_prudent_unsupported");
            throw new IllegalStateException("Prudent mode is not supported.");
        } else if (getParentsRawFileProperty() == null) {
            addError("The File name property must be set before using this rolling policy.");
            addError("Please refer to http://logback.qos.ch/codes.html#fwrp_parentFileName_not_set");
            throw new IllegalStateException("The \"File\" option must be set.");
        } else {
            if (this.f40024g < this.f40025h) {
                addWarn("MaxIndex (" + this.f40024g + ") cannot be smaller than MinIndex (" + this.f40025h + ").");
                addWarn("Setting maxIndex to equal minIndex.");
                this.f40024g = this.f40025h;
            }
            int maxWindowSize = getMaxWindowSize();
            if (this.f40024g - this.f40025h > maxWindowSize) {
                addWarn("Large window sizes are not allowed.");
                this.f40024g = this.f40025h + maxWindowSize;
                addWarn("MaxIndex reduced to " + this.f40024g);
            }
            if (this.f40037c.getIntegerTokenConverter() == null) {
                throw new IllegalStateException("FileNamePattern [" + this.f40037c.getPattern() + "] does not contain a valid IntegerToken");
            }
            if (this.compressionMode == CompressionMode.ZIP) {
                this.f40039e = new FileNamePattern(m51396b(this.fileNamePatternStr), this.context);
            }
            Compressor compressor = new Compressor(this.compressionMode);
            this.f40027j = compressor;
            compressor.setContext(this.context);
            super.start();
        }
    }
}