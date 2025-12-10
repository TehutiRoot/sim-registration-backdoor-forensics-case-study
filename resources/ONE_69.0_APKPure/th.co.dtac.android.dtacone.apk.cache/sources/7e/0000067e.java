package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Gq2 */
/* loaded from: classes3.dex */
public final class Gq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Gq2 f2206a = new Gq2();

    /* renamed from: b */
    public static final FieldDescriptor f2207b;

    /* renamed from: c */
    public static final FieldDescriptor f2208c;

    /* renamed from: d */
    public static final FieldDescriptor f2209d;

    /* renamed from: e */
    public static final FieldDescriptor f2210e;

    /* renamed from: f */
    public static final FieldDescriptor f2211f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f2207b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f2208c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputsFormats");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f2209d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputFormats");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f2210e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelInitializationMs");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f2211f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjq zzjqVar = (zzjq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}