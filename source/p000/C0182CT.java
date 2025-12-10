package p000;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: CT */
/* loaded from: classes5.dex */
public final class C0182CT extends ByteArrayOutputStream {
    public C0182CT(int i) {
        super(i);
    }

    /* renamed from: b */
    public final byte[] m68773b() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
