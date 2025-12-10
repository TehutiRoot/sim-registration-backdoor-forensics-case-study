package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdc {

    /* renamed from: a */
    public final Map f47306a;

    /* renamed from: b */
    public final Map f47307b;

    /* renamed from: c */
    public final ObjectEncoder f47308c;

    public zzdc(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f47306a = map;
        this.f47307b = map2;
        this.f47308c = objectEncoder;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C21112mh2(byteArrayOutputStream, this.f47306a, this.f47307b, this.f47308c).m26219f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
