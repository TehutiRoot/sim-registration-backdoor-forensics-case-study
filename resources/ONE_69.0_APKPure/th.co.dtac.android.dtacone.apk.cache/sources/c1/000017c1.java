package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzly;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Yv2 */
/* loaded from: classes3.dex */
public final class Yv2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Yv2 f8049a = new Yv2();

    /* renamed from: b */
    public static final FieldDescriptor f8050b;

    /* renamed from: c */
    public static final FieldDescriptor f8051c;

    /* renamed from: d */
    public static final FieldDescriptor f8052d;

    /* renamed from: e */
    public static final FieldDescriptor f8053e;

    /* renamed from: f */
    public static final FieldDescriptor f8054f;

    /* renamed from: g */
    public static final FieldDescriptor f8055g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f8050b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("multipleObjectsEnabled");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f8051c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classificationEnabled");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f8052d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("maxPerObjectLabelCount");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f8053e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("classificationConfidenceThreshold");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f8054f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("customLocalModelOptions");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f8055g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzly zzlyVar = (zzly) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}