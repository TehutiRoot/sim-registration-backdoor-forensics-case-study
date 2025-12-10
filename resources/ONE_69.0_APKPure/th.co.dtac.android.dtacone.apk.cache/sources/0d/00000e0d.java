package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Op2 */
/* loaded from: classes3.dex */
public final class Op2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Op2 f4545a = new Op2();

    /* renamed from: b */
    public static final FieldDescriptor f4546b;

    /* renamed from: c */
    public static final FieldDescriptor f4547c;

    /* renamed from: d */
    public static final FieldDescriptor f4548d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxLabels");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f4546b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("confidenceThreshold");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f4547c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("customLocalModelOptions");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f4548d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjx zzjxVar = (zzjx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}