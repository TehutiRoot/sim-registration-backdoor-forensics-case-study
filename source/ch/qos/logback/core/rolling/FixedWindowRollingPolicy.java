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
    public static int f40025k = 20;

    /* renamed from: j */
    public Compressor f40029j;

    /* renamed from: i */
    public RenameUtil f40028i = new RenameUtil();

    /* renamed from: h */
    public int f40027h = 1;

    /* renamed from: g */
    public int f40026g = 7;

    /* renamed from: ch.qos.logback.core.rolling.FixedWindowRollingPolicy$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5485a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40030a;

        static {
            int[] iArr = new int[CompressionMode.values().length];
            f40030a = iArr;
            try {
                iArr[CompressionMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40030a[CompressionMode.GZ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40030a[CompressionMode.ZIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: b */
    public final String m51401b(String str) {
        return FileFilterUtil.afterLastSlash(FileFilterUtil.slashify(str)).replace("%i", "%d{yyyy-MM-dd_HHmm}");
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public String getActiveFileName() {
        return getParentsRawFileProperty();
    }

    public int getMaxIndex() {
        return this.f40026g;
    }

    public int getMaxWindowSize() {
        return f40025k;
    }

    public int getMinIndex() {
        return this.f40027h;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public void rollover() throws RolloverFailure {
        Compressor compressor;
        String activeFileName;
        String convertInt;
        String str;
        if (this.f40026g >= 0) {
            File file = new File(this.f40039c.convertInt(this.f40026g));
            if (file.exists()) {
                file.delete();
            }
            for (int i = this.f40026g - 1; i >= this.f40027h; i--) {
                String convertInt2 = this.f40039c.convertInt(i);
                if (new File(convertInt2).exists()) {
                    this.f40028i.rename(convertInt2, this.f40039c.convertInt(i + 1));
                } else {
                    addInfo("Skipping roll-over for inexistent file " + convertInt2);
                }
            }
            int i2 = C5485a.f40030a[this.compressionMode.ordinal()];
            if (i2 == 1) {
                this.f40028i.rename(getActiveFileName(), this.f40039c.convertInt(this.f40027h));
                return;
            }
            if (i2 == 2) {
                compressor = this.f40029j;
                activeFileName = getActiveFileName();
                convertInt = this.f40039c.convertInt(this.f40027h);
                str = null;
            } else if (i2 != 3) {
                return;
            } else {
                compressor = this.f40029j;
                activeFileName = getActiveFileName();
                convertInt = this.f40039c.convertInt(this.f40027h);
                str = this.f40041e.convert(new Date());
            }
            compressor.compress(activeFileName, convertInt, str);
        }
    }

    public void setMaxIndex(int i) {
        this.f40026g = i;
    }

    public void setMinIndex(int i) {
        this.f40027h = i;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f40028i.setContext(this.context);
        if (this.fileNamePatternStr == null) {
            addError("The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. ");
            addError(CoreConstants.SEE_FNP_NOT_SET);
            throw new IllegalStateException("The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
        }
        this.f40039c = new FileNamePattern(this.fileNamePatternStr, this.context);
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
            if (this.f40026g < this.f40027h) {
                addWarn("MaxIndex (" + this.f40026g + ") cannot be smaller than MinIndex (" + this.f40027h + ").");
                addWarn("Setting maxIndex to equal minIndex.");
                this.f40026g = this.f40027h;
            }
            int maxWindowSize = getMaxWindowSize();
            if (this.f40026g - this.f40027h > maxWindowSize) {
                addWarn("Large window sizes are not allowed.");
                this.f40026g = this.f40027h + maxWindowSize;
                addWarn("MaxIndex reduced to " + this.f40026g);
            }
            if (this.f40039c.getIntegerTokenConverter() == null) {
                throw new IllegalStateException("FileNamePattern [" + this.f40039c.getPattern() + "] does not contain a valid IntegerToken");
            }
            if (this.compressionMode == CompressionMode.ZIP) {
                this.f40041e = new FileNamePattern(m51401b(this.fileNamePatternStr), this.context);
            }
            Compressor compressor = new Compressor(this.compressionMode);
            this.f40029j = compressor;
            compressor.setContext(this.context);
            super.start();
        }
    }
}
