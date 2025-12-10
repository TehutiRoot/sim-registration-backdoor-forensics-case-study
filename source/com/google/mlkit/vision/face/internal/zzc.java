package com.google.mlkit.vision.face.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.vision.face.FaceDetectorOptions;

/* loaded from: classes4.dex */
public final class zzc {

    /* renamed from: a */
    public final zze f57145a;

    /* renamed from: b */
    public final ExecutorSelector f57146b;

    public zzc(zze zzeVar, ExecutorSelector executorSelector) {
        this.f57145a = zzeVar;
        this.f57146b = executorSelector;
    }

    @NonNull
    public final FaceDetectorImpl zza() {
        return zzb(FaceDetectorImpl.f57143h);
    }

    @NonNull
    public final FaceDetectorImpl zzb(@NonNull FaceDetectorOptions faceDetectorOptions) {
        Preconditions.checkNotNull(faceDetectorOptions, "You must provide a valid FaceDetectorOptions.");
        return new FaceDetectorImpl((zzh) this.f57145a.get(faceDetectorOptions), this.f57146b, faceDetectorOptions, null);
    }
}
