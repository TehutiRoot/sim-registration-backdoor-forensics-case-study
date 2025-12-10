package p000;

import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbf;
import java.util.concurrent.TimeUnit;

/* renamed from: jd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20640jd2 extends zzbf {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbf
    public final long zza() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}