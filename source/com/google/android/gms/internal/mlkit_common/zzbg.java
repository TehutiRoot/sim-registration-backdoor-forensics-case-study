package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbg implements EncoderConfig {

    /* renamed from: d */
    public static final ObjectEncoder f46398d = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_common.zzbf
        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            ObjectEncoder objectEncoder = zzbg.f46398d;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a */
    public final Map f46399a = new HashMap();

    /* renamed from: b */
    public final Map f46400b = new HashMap();

    /* renamed from: c */
    public final ObjectEncoder f46401c = f46398d;

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.f46399a.put(cls, objectEncoder);
        this.f46400b.remove(cls);
        return this;
    }

    public final zzbh zza() {
        return new zzbh(new HashMap(this.f46399a), new HashMap(this.f46400b), this.f46401c);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ValueEncoder valueEncoder) {
        this.f46400b.put(cls, valueEncoder);
        this.f46399a.remove(cls);
        return this;
    }
}
