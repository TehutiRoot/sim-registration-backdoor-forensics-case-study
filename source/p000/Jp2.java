package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Jp2 */
/* loaded from: classes3.dex */
public final class Jp2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Jp2 f3032a = new Jp2();

    /* renamed from: b */
    public static final FieldDescriptor f3033b;

    /* renamed from: c */
    public static final FieldDescriptor f3034c;

    /* renamed from: d */
    public static final FieldDescriptor f3035d;

    /* renamed from: e */
    public static final FieldDescriptor f3036e;

    /* renamed from: f */
    public static final FieldDescriptor f3037f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3033b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f3034c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputsFormats");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f3035d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputFormats");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f3036e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelInitializationMs");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f3037f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjq zzjqVar = (zzjq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
