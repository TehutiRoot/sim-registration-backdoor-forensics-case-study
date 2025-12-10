package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Np2 */
/* loaded from: classes3.dex */
public final class Np2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Np2 f4207a = new Np2();

    /* renamed from: b */
    public static final FieldDescriptor f4208b;

    /* renamed from: c */
    public static final FieldDescriptor f4209c;

    /* renamed from: d */
    public static final FieldDescriptor f4210d;

    /* renamed from: e */
    public static final FieldDescriptor f4211e;

    /* renamed from: f */
    public static final FieldDescriptor f4212f;

    /* renamed from: g */
    public static final FieldDescriptor f4213g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f4208b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("multipleObjectsEnabled");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f4209c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classificationEnabled");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f4210d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("maxPerObjectLabelCount");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f4211e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("classificationConfidenceThreshold");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f4212f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("customLocalModelOptions");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f4213g = builder6.withProperty(zzaeVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkh zzkhVar = (zzkh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
