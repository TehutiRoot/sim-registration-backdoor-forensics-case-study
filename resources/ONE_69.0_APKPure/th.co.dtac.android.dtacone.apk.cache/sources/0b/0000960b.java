package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzfl {

    /* renamed from: a */
    public final Map f46606a;

    /* renamed from: b */
    public final Map f46607b;

    /* renamed from: c */
    public final ObjectEncoder f46608c;

    public zzfl(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f46606a = map;
        this.f46607b = map2;
        this.f46608c = objectEncoder;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C19119ap2(byteArrayOutputStream, this.f46606a, this.f46607b, this.f46608c).m52067f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}