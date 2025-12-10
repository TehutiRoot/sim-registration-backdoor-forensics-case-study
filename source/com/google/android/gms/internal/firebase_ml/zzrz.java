package com.google.android.gms.internal.firebase_ml;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes3.dex */
public abstract class zzrz<ResultType> implements Closeable {

    /* renamed from: a */
    public final zzsc f46005a;

    /* renamed from: b */
    public final zzku f46006b;

    /* renamed from: c */
    public final zzqj f46007c;

    /* renamed from: d */
    public final zzkz f46008d;
    protected final zzqn zzbms;

    public zzrz(@NonNull zzqn zzqnVar, @NonNull String str, @NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        this(zzqnVar, new zzku().zza(Integer.valueOf(firebaseVisionCloudDetectorOptions.getMaxResults())).zzay(str).zzax(zzry.zzca(firebaseVisionCloudDetectorOptions.getModelType())), (zzkz) null, firebaseVisionCloudDetectorOptions.isEnforceCertFingerprintMatch());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public final Task<ResultType> zza(@NonNull FirebaseVisionImage firebaseVisionImage) {
        Preconditions.checkNotNull(firebaseVisionImage, "Input image can not be null");
        Pair<byte[], Float> zze = firebaseVisionImage.zze(zzqv(), zzqw());
        if (zze.first == null) {
            return Tasks.forException(new FirebaseMLException("Can not convert the image format", 3));
        }
        return this.f46007c.zza((zzqc<T, zzsc>) this.f46005a, (zzsc) new zzsa((byte[]) zze.first, ((Float) zze.second).floatValue(), Collections.singletonList(this.f46006b), this.f46008d));
    }

    public abstract ResultType zza(@NonNull zzkl zzklVar, float f);

    public abstract int zzqv();

    public abstract int zzqw();

    public zzrz(@NonNull zzqn zzqnVar, @NonNull String str, @NonNull zzkz zzkzVar, boolean z) {
        this(zzqnVar, new zzku().zzay(str).zzax(zzry.zzca(1)), (zzkz) Preconditions.checkNotNull(zzkzVar, "ImageContext must not be null"), z);
    }

    public zzrz(zzqn zzqnVar, zzku zzkuVar, zzkz zzkzVar, boolean z) {
        Preconditions.checkNotNull(zzqnVar, "MlKitContext must not be null");
        Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Firebase app name must not be null");
        this.f46006b = (zzku) Preconditions.checkNotNull(zzkuVar);
        this.f46007c = zzqj.zza(zzqnVar);
        this.f46005a = new zzsc(this, zzqnVar.zzos(), z);
        this.zzbms = zzqnVar;
        this.f46008d = zzkzVar;
    }
}
