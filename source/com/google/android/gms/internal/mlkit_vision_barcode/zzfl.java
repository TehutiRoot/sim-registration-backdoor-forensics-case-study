package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzfl {

    /* renamed from: a */
    public final Map f46594a;

    /* renamed from: b */
    public final Map f46595b;

    /* renamed from: c */
    public final ObjectEncoder f46596c;

    public zzfl(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f46594a = map;
        this.f46595b = map2;
        this.f46596c = objectEncoder;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C19585do2(byteArrayOutputStream, this.f46594a, this.f46595b, this.f46596c).m31686f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
