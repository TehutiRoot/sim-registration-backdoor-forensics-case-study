package p000;

import com.google.android.gms.internal.firebase_ml.zzgs;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: cs2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19425cs2 extends BufferedOutputStream {
    public C19425cs2(zzgs zzgsVar, OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } catch (IOException unused) {
        }
    }
}
