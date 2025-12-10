package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzed;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Bn2 */
/* loaded from: classes3.dex */
public final class Bn2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Bn2 f510a = new Bn2();

    /* renamed from: b */
    public static final FieldDescriptor f511b;

    /* renamed from: c */
    public static final FieldDescriptor f512c;

    /* renamed from: d */
    public static final FieldDescriptor f513d;

    /* renamed from: e */
    public static final FieldDescriptor f514e;

    /* renamed from: f */
    public static final FieldDescriptor f515f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f511b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f512c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelInitializationMs");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f513d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("confidenceThreshold");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f514e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f515f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzed zzedVar = (zzed) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
