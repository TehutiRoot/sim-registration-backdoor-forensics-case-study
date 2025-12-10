package p000;

import java.io.Closeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;

/* renamed from: lK0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC20883lK0 {
    /* renamed from: a */
    public static final Sink m26487a() {
        return new C1327Sb();
    }

    /* renamed from: b */
    public static final BufferedSink m26486b(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return new RealBufferedSink(sink);
    }

    /* renamed from: c */
    public static final BufferedSource m26485c(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return new RealBufferedSource(source);
    }

    /* renamed from: d */
    public static final Object m26484d(Closeable closeable, Function1 block) {
        Object obj;
        Intrinsics.checkNotNullParameter(block, "block");
        Throwable th2 = null;
        try {
            obj = block.invoke(closeable);
            InlineMarker.finallyStart(1);
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th4) {
            InlineMarker.finallyStart(1);
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th5) {
                    AbstractC5370bT.addSuppressed(th4, th5);
                }
            }
            InlineMarker.finallyEnd(1);
            th2 = th4;
            obj = null;
        }
        if (th2 == null) {
            Intrinsics.checkNotNull(obj);
            return obj;
        }
        throw th2;
    }
}
