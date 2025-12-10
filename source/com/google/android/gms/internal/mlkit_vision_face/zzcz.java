package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcz {

    /* renamed from: a */
    public final Map f47105a;

    /* renamed from: b */
    public final Map f47106b;

    /* renamed from: c */
    public final ObjectEncoder f47107c;

    public zzcz(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f47105a = map;
        this.f47106b = map2;
        this.f47107c = objectEncoder;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C19220bh2(byteArrayOutputStream, this.f47105a, this.f47106b, this.f47107c).m51898f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
