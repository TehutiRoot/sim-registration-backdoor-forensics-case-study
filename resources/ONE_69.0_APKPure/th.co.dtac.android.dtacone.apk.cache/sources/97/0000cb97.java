package io.grpc;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

@Internal
/* loaded from: classes5.dex */
public final class InternalLogId {

    /* renamed from: d */
    public static final AtomicLong f63311d = new AtomicLong();

    /* renamed from: a */
    public final String f63312a;

    /* renamed from: b */
    public final String f63313b;

    /* renamed from: c */
    public final long f63314c;

    public InternalLogId(String str, String str2, long j) {
        Preconditions.checkNotNull(str, "typeName");
        Preconditions.checkArgument(!str.isEmpty(), "empty type");
        this.f63312a = str;
        this.f63313b = str2;
        this.f63314c = j;
    }

    /* renamed from: a */
    public static String m30765a(Class cls) {
        String simpleName = ((Class) Preconditions.checkNotNull(cls, "type")).getSimpleName();
        if (!simpleName.isEmpty()) {
            return simpleName;
        }
        return cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    public static InternalLogId allocate(Class<?> cls, @Nullable String str) {
        return allocate(m30765a(cls), str);
    }

    /* renamed from: b */
    public static long m30764b() {
        return f63311d.incrementAndGet();
    }

    @Nullable
    public String getDetails() {
        return this.f63313b;
    }

    public long getId() {
        return this.f63314c;
    }

    public String getTypeName() {
        return this.f63312a;
    }

    public String shortName() {
        return this.f63312a + "<" + this.f63314c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(shortName());
        if (this.f63313b != null) {
            sb.append(": (");
            sb.append(this.f63313b);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        return sb.toString();
    }

    public static InternalLogId allocate(String str, @Nullable String str2) {
        return new InternalLogId(str, str2, m30764b());
    }
}