package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzan {

    /* renamed from: a */
    public final Map f46990a;

    /* renamed from: b */
    public final Map f46991b;

    /* renamed from: c */
    public final ObjectEncoder f46992c;

    public zzan(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f46990a = map;
        this.f46991b = map2;
        this.f46992c = objectEncoder;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C18546Ub2(byteArrayOutputStream, this.f46990a, this.f46991b, this.f46992c).m66011f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
