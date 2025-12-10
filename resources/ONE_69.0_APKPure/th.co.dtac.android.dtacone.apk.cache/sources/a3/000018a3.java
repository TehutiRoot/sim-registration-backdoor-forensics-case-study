package p000;

import com.google.android.gms.internal.firebase_ml.zzgs;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: Zs2 */
/* loaded from: classes3.dex */
public final class Zs2 extends BufferedOutputStream {
    public Zs2(zzgs zzgsVar, OutputStream outputStream) {
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