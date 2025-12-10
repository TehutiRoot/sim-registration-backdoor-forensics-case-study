package p000;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: GT */
/* loaded from: classes5.dex */
public final class C0452GT extends ByteArrayOutputStream {
    public C0452GT(int i) {
        super(i);
    }

    /* renamed from: b */
    public final byte[] m68282b() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}