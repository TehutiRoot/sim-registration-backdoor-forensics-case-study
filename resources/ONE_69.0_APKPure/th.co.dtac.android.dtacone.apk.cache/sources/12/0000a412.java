package com.google.android.odml.image;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ByteBufferExtractor {
    @NonNull
    public static ByteBuffer extract(@NonNull MlImage mlImage) {
        Pq2 m43405b = mlImage.m43405b();
        if (m43405b.zzb().getStorageType() == 2) {
            return ((On2) m43405b).m67076a().asReadOnlyBuffer();
        }
        throw new IllegalArgumentException("Extract ByteBuffer from an MlImage created by objects other than Bytebuffer is not supported");
    }
}