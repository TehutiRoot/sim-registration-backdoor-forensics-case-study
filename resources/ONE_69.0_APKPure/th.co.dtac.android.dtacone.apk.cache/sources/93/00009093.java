package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.vision.Frame;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzsh<TDetectionResult> implements Closeable {

    /* renamed from: a */
    public final zzqc f46036a;

    /* renamed from: b */
    public final zzqj f46037b;

    public zzsh(@NonNull zzqn zzqnVar, zzqc<TDetectionResult, zzsn> zzqcVar) {
        Preconditions.checkNotNull(zzqnVar, "MlKitContext must not be null");
        Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Persistence key must not be null");
        this.f46036a = zzqcVar;
        zzqj zza = zzqj.zza(zzqnVar);
        this.f46037b = zza;
        zza.zza(zzqcVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f46037b.zzb(this.f46036a);
    }

    public final Task<TDetectionResult> zza(@NonNull FirebaseVisionImage firebaseVisionImage, boolean z, boolean z2) {
        Preconditions.checkNotNull(firebaseVisionImage, "FirebaseVisionImage can not be null");
        Frame zza = firebaseVisionImage.zza(z, z2);
        if (zza.getMetadata().getWidth() >= 32 && zza.getMetadata().getHeight() >= 32) {
            return this.f46037b.zza((zzqc<T, zzqc>) this.f46036a, (zzqc) new zzsn(firebaseVisionImage, zza));
        }
        return Tasks.forException(new FirebaseMLException("Image width and height should be at least 32!", 3));
    }
}