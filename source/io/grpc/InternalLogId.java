package io.grpc;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

@Internal
/* loaded from: classes5.dex */
public final class InternalLogId {

    /* renamed from: d */
    public static final AtomicLong f63248d = new AtomicLong();

    /* renamed from: a */
    public final String f63249a;

    /* renamed from: b */
    public final String f63250b;

    /* renamed from: c */
    public final long f63251c;

    public InternalLogId(String str, String str2, long j) {
        Preconditions.checkNotNull(str, "typeName");
        Preconditions.checkArgument(!str.isEmpty(), "empty type");
        this.f63249a = str;
        this.f63250b = str2;
        this.f63251c = j;
    }

    /* renamed from: a */
    public static String m30425a(Class cls) {
        String simpleName = ((Class) Preconditions.checkNotNull(cls, "type")).getSimpleName();
        if (!simpleName.isEmpty()) {
            return simpleName;
        }
        return cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    public static InternalLogId allocate(Class<?> cls, @Nullable String str) {
        return allocate(m30425a(cls), str);
    }

    /* renamed from: b */
    public static long m30424b() {
        return f63248d.incrementAndGet();
    }

    @Nullable
    public String getDetails() {
        return this.f63250b;
    }

    public long getId() {
        return this.f63251c;
    }

    public String getTypeName() {
        return this.f63249a;
    }

    public String shortName() {
        return this.f63249a + "<" + this.f63251c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(shortName());
        if (this.f63250b != null) {
            sb.append(": (");
            sb.append(this.f63250b);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        return sb.toString();
    }

    public static InternalLogId allocate(String str, @Nullable String str2) {
        return new InternalLogId(str, str2, m30424b());
    }
}
