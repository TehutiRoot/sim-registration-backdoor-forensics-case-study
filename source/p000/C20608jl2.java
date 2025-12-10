package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zziq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: jl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20608jl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20608jl2 f67358a = new C20608jl2();

    /* renamed from: b */
    public static final FieldDescriptor f67359b;

    /* renamed from: c */
    public static final FieldDescriptor f67360c;

    /* renamed from: d */
    public static final FieldDescriptor f67361d;

    /* renamed from: e */
    public static final FieldDescriptor f67362e;

    /* renamed from: f */
    public static final FieldDescriptor f67363f;

    /* renamed from: g */
    public static final FieldDescriptor f67364g;

    /* renamed from: h */
    public static final FieldDescriptor f67365h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f67359b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageSource");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f67360c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageFormat");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f67361d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageByteSize");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f67362e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageWidth");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f67363f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("imageHeight");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f67364g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("rotationDegrees");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f67365h = builder7.withProperty(zzaeVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zziq zziqVar = (zziq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f67359b, zziqVar.zzg());
        objectEncoderContext.add(f67360c, zziqVar.zzb());
        objectEncoderContext.add(f67361d, zziqVar.zza());
        objectEncoderContext.add(f67362e, zziqVar.zzc());
        objectEncoderContext.add(f67363f, zziqVar.zze());
        objectEncoderContext.add(f67364g, zziqVar.zzd());
        objectEncoderContext.add(f67365h, zziqVar.zzf());
    }
}
