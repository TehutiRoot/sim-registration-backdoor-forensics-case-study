package ch.qos.logback.core.rolling;

import ch.qos.logback.core.util.DefaultInvocationGate;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.InvocationGate;
import java.io.File;

/* loaded from: classes.dex */
public class SizeBasedTriggeringPolicy<E> extends TriggeringPolicyBase<E> {
    public static final long DEFAULT_MAX_FILE_SIZE = 10485760;
    public static final String SEE_SIZE_FORMAT = "http://logback.qos.ch/codes.html#sbtp_size_format";

    /* renamed from: d */
    public FileSize f40048d = new FileSize(DEFAULT_MAX_FILE_SIZE);

    /* renamed from: e */
    public InvocationGate f40049e = new DefaultInvocationGate();

    public FileSize getMaxFileSize() {
        return this.f40048d;
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e) {
        return !this.f40049e.isTooSoon(System.currentTimeMillis()) && file.length() >= this.f40048d.getSize();
    }

    public void setMaxFileSize(FileSize fileSize) {
        this.f40048d = fileSize;
    }
}