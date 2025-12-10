package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ks2 */
/* loaded from: classes3.dex */
public final class Ks2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ks2 f3296a = new Ks2();

    /* renamed from: b */
    public static final FieldDescriptor f3297b;

    /* renamed from: c */
    public static final FieldDescriptor f3298c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("language");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f3297b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f3298c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzle zzleVar = (zzle) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
