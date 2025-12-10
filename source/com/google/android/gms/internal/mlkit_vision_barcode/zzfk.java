package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzfk implements EncoderConfig {

    /* renamed from: d */
    public static final ObjectEncoder f46590d = zzfj.zza;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a */
    public final Map f46591a = new HashMap();

    /* renamed from: b */
    public final Map f46592b = new HashMap();

    /* renamed from: c */
    public final ObjectEncoder f46593c = f46590d;

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.f46591a.put(cls, objectEncoder);
        this.f46592b.remove(cls);
        return this;
    }

    public final zzfl zza() {
        return new zzfl(new HashMap(this.f46591a), new HashMap(this.f46592b), this.f46593c);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ValueEncoder valueEncoder) {
        this.f46592b.put(cls, valueEncoder);
        this.f46591a.remove(cls);
        return this;
    }
}
