package com.google.android.odml.image;

import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* loaded from: classes4.dex */
public class MediaImageExtractor {
    @NonNull
    public static Image extract(@NonNull MlImage mlImage) {
        Pq2 m43405b = mlImage.m43405b();
        if (m43405b.zzb().getStorageType() == 3) {
            return ((C19489cx2) m43405b).m31950a();
        }
        throw new IllegalArgumentException("Extract Media Image from an MlImage created by objects other than Media Image is not supported");
    }
}