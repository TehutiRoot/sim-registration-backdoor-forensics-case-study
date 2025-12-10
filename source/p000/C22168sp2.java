package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: sp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22168sp2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22168sp2 f79907a = new C22168sp2();

    /* renamed from: b */
    public static final FieldDescriptor f79908b;

    /* renamed from: c */
    public static final FieldDescriptor f79909c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f79908b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE);
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f79909c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkc zzkcVar = (zzkc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
