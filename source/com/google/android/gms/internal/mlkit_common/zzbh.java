package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbh {

    /* renamed from: a */
    public final Map f46402a;

    /* renamed from: b */
    public final Map f46403b;

    /* renamed from: c */
    public final ObjectEncoder f46404c;

    public zzbh(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f46402a = map;
        this.f46403b = map2;
        this.f46404c = objectEncoder;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C19555de2(byteArrayOutputStream, this.f46402a, this.f46403b, this.f46404c).m31820f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
