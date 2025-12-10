package com.google.android.odml.image;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class BitmapExtractor {
    @NonNull
    public static Bitmap extract(@NonNull MlImage mlImage) {
        Sp2 m43418b = mlImage.m43418b();
        if (m43418b.zzb().getStorageType() == 1) {
            return ((C19229bk2) m43418b).m51817a();
        }
        throw new IllegalArgumentException("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
    }
}
