package com.google.android.odml.image;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class BitmapExtractor {
    @NonNull
    public static Bitmap extract(@NonNull MlImage mlImage) {
        Pq2 m43405b = mlImage.m43405b();
        if (m43405b.zzb().getStorageType() == 1) {
            return ((C18876Yk2) m43405b).m65362a();
        }
        throw new IllegalArgumentException("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
    }
}