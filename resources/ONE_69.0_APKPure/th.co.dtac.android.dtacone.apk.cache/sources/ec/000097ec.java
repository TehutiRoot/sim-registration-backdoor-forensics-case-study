package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzan {

    /* renamed from: a */
    public final Map f47002a;

    /* renamed from: b */
    public final Map f47003b;

    /* renamed from: c */
    public final ObjectEncoder f47004c;

    public zzan(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f47002a = map;
        this.f47003b = map2;
        this.f47004c = objectEncoder;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C18397Rc2(byteArrayOutputStream, this.f47002a, this.f47003b, this.f47004c).m66620f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}