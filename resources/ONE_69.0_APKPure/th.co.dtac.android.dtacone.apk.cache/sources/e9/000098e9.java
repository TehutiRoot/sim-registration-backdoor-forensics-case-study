package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcz {

    /* renamed from: a */
    public final Map f47117a;

    /* renamed from: b */
    public final Map f47118b;

    /* renamed from: c */
    public final ObjectEncoder f47119c;

    public zzcz(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f47117a = map;
        this.f47118b = map2;
        this.f47119c = objectEncoder;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C18867Yh2(byteArrayOutputStream, this.f47117a, this.f47118b, this.f47119c).m65420f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}