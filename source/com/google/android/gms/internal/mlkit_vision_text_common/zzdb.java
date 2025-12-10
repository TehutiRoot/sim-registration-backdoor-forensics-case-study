package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdb implements EncoderConfig {

    /* renamed from: d */
    public static final ObjectEncoder f47302d = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzda
        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            ObjectEncoder objectEncoder = zzdb.f47302d;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a */
    public final Map f47303a = new HashMap();

    /* renamed from: b */
    public final Map f47304b = new HashMap();

    /* renamed from: c */
    public final ObjectEncoder f47305c = f47302d;

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.f47303a.put(cls, objectEncoder);
        this.f47304b.remove(cls);
        return this;
    }

    public final zzdc zza() {
        return new zzdc(new HashMap(this.f47303a), new HashMap(this.f47304b), this.f47305c);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public final /* bridge */ /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ValueEncoder valueEncoder) {
        this.f47304b.put(cls, valueEncoder);
        this.f47303a.remove(cls);
        return this;
    }
}
