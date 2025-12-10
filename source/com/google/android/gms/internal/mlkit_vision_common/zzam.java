package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzam implements EncoderConfig {

    /* renamed from: d */
    public static final ObjectEncoder f46986d = zzal.zza;
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a */
    public final Map f46987a = new HashMap();

    /* renamed from: b */
    public final Map f46988b = new HashMap();

    /* renamed from: c */
    public final ObjectEncoder f46989c = f46986d;

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.f46987a.put(cls, objectEncoder);
        this.f46988b.remove(cls);
        return this;
    }

    public final zzan zza() {
        return new zzan(new HashMap(this.f46987a), new HashMap(this.f46988b), this.f46989c);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ValueEncoder valueEncoder) {
        this.f46988b.put(cls, valueEncoder);
        this.f46987a.remove(cls);
        return this;
    }
}
