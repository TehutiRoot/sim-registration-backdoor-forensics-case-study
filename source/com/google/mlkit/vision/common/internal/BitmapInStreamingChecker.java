package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.common.InputImage;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* loaded from: classes4.dex */
public class BitmapInStreamingChecker {

    /* renamed from: c */
    public static final GmsLogger f57099c = new GmsLogger("StreamingFormatChecker", "");

    /* renamed from: a */
    public final LinkedList f57100a = new LinkedList();

    /* renamed from: b */
    public long f57101b = -1;

    @KeepForSdk
    public void check(@NonNull InputImage inputImage) {
        if (inputImage.getFormat() != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f57100a.add(Long.valueOf(elapsedRealtime));
        if (this.f57100a.size() > 5) {
            this.f57100a.removeFirst();
        }
        if (this.f57100a.size() == 5 && elapsedRealtime - ((Long) Preconditions.checkNotNull((Long) this.f57100a.peekFirst())).longValue() < CoroutineLiveDataKt.DEFAULT_TIMEOUT) {
            long j = this.f57101b;
            if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
                this.f57101b = elapsedRealtime;
                f57099c.m48400w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
            }
        }
    }
}
