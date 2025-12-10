package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzsa implements zzqg {
    public final List<zzku> features;
    public final zzkz imageContext;
    public final byte[] zzbtw;
    public final float zzbtx;

    public zzsa(@NonNull byte[] bArr, float f, @NonNull List<zzku> list, @Nullable zzkz zzkzVar) {
        this.zzbtw = bArr;
        this.zzbtx = f;
        this.features = list;
        this.imageContext = zzkzVar;
    }
}
