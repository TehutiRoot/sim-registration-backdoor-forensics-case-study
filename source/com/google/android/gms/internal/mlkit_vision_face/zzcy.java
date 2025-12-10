package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcy implements EncoderConfig {

    /* renamed from: d */
    public static final ObjectEncoder f47101d = zzcx.zza;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a */
    public final Map f47102a = new HashMap();

    /* renamed from: b */
    public final Map f47103b = new HashMap();

    /* renamed from: c */
    public final ObjectEncoder f47104c = f47101d;

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.f47102a.put(cls, objectEncoder);
        this.f47103b.remove(cls);
        return this;
    }

    public final zzcz zza() {
        return new zzcz(new HashMap(this.f47102a), new HashMap(this.f47103b), this.f47104c);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ValueEncoder valueEncoder) {
        this.f47103b.put(cls, valueEncoder);
        this.f47102a.remove(cls);
        return this;
    }
}
