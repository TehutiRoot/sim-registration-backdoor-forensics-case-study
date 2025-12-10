package com.google.android.gms.internal.firebase_ml;

import android.os.SystemClock;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzsg {

    /* renamed from: c */
    public static final GmsLogger f46021c = new GmsLogger("StreamingFormatChecker", "");

    /* renamed from: a */
    public final LinkedList f46022a = new LinkedList();

    /* renamed from: b */
    public long f46023b = -1;

    public final void zzb(zzsn zzsnVar) {
        if (zzsnVar.zzbuo.getBitmap() == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f46022a.add(Long.valueOf(elapsedRealtime));
        if (this.f46022a.size() > 5) {
            this.f46022a.removeFirst();
        }
        if (this.f46022a.size() == 5 && elapsedRealtime - ((Long) this.f46022a.peekFirst()).longValue() < CoroutineLiveDataKt.DEFAULT_TIMEOUT) {
            long j = this.f46023b;
            if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
                this.f46023b = elapsedRealtime;
                f46021c.m48400w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
            }
        }
    }
}
