package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzly;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: bv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19262bv2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19262bv2 f39275a = new C19262bv2();

    /* renamed from: b */
    public static final FieldDescriptor f39276b;

    /* renamed from: c */
    public static final FieldDescriptor f39277c;

    /* renamed from: d */
    public static final FieldDescriptor f39278d;

    /* renamed from: e */
    public static final FieldDescriptor f39279e;

    /* renamed from: f */
    public static final FieldDescriptor f39280f;

    /* renamed from: g */
    public static final FieldDescriptor f39281g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f39276b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("multipleObjectsEnabled");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f39277c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classificationEnabled");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f39278d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("maxPerObjectLabelCount");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f39279e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("classificationConfidenceThreshold");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f39280f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("customLocalModelOptions");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f39281g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzly zzlyVar = (zzly) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
