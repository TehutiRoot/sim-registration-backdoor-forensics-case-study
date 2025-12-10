package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ht2 */
/* loaded from: classes3.dex */
public final class Ht2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ht2 f2504a = new Ht2();

    /* renamed from: b */
    public static final FieldDescriptor f2505b;

    /* renamed from: c */
    public static final FieldDescriptor f2506c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("language");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f2505b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f2506c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzle zzleVar = (zzle) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}