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

/* renamed from: rK0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC21978rK0 {
    /* renamed from: a */
    public static final Sink m23526a() {
        return new C1301Sb();
    }

    /* renamed from: b */
    public static final BufferedSink m23525b(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return new RealBufferedSink(sink);
    }

    /* renamed from: c */
    public static final BufferedSource m23524c(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return new RealBufferedSource(source);
    }

    /* renamed from: d */
    public static final Object m23523d(Closeable closeable, Function1 block) {
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
                    AbstractC10223fT.addSuppressed(th4, th5);
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