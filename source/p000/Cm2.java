package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjf;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Cm2 */
/* loaded from: classes3.dex */
public final class Cm2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Cm2 f823a = new Cm2();

    /* renamed from: b */
    public static final FieldDescriptor f824b;

    /* renamed from: c */
    public static final FieldDescriptor f825c;

    /* renamed from: d */
    public static final FieldDescriptor f826d;

    /* renamed from: e */
    public static final FieldDescriptor f827e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("category");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f824b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationConfidence");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f825c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("trackingId");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f826d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("labelCount");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f827e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjf zzjfVar = (zzjf) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
