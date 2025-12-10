package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP;
import ch.qos.logback.core.util.FileSize;

/* loaded from: classes.dex */
public class SizeAndTimeBasedRollingPolicy<E> extends TimeBasedRollingPolicy<E> {

    /* renamed from: p */
    public FileSize f40047p;

    public void setMaxFileSize(FileSize fileSize) {
        this.f40047p = fileSize;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedRollingPolicy, ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String str;
        SizeAndTimeBasedFNATP sizeAndTimeBasedFNATP = new SizeAndTimeBasedFNATP(SizeAndTimeBasedFNATP.Usage.EMBEDDED);
        if (this.f40047p == null) {
            str = "maxFileSize property is mandatory";
        } else {
            addInfo("Archive files will be limited to [" + this.f40047p + "] each.");
            sizeAndTimeBasedFNATP.setMaxFileSize(this.f40047p);
            this.f40059n = sizeAndTimeBasedFNATP;
            if (isUnboundedTotalSizeCap() || this.totalSizeCap.getSize() >= this.f40047p.getSize()) {
                super.start();
                return;
            }
            str = "totalSizeCap of [" + this.totalSizeCap + "] is smaller than maxFileSize [" + this.f40047p + "] which is non-sensical";
        }
        addError(str);
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedRollingPolicy
    public String toString() {
        return "c.q.l.core.rolling.SizeAndTimeBasedRollingPolicy@" + hashCode();
    }
}