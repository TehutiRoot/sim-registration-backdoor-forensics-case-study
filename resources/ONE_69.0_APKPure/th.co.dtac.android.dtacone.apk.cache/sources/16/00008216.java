package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class EmptySignature implements Key {

    /* renamed from: a */
    public static final EmptySignature f42715a = new EmptySignature();

    @NonNull
    public static EmptySignature obtain() {
        return f42715a;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }
}