package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Mu2 */
/* loaded from: classes3.dex */
public final class Mu2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Mu2 f4008a = new Mu2();

    /* renamed from: b */
    public static final FieldDescriptor f4009b;

    /* renamed from: c */
    public static final FieldDescriptor f4010c;

    /* renamed from: d */
    public static final FieldDescriptor f4011d;

    /* renamed from: e */
    public static final FieldDescriptor f4012e;

    /* renamed from: f */
    public static final FieldDescriptor f4013f;

    /* renamed from: g */
    public static final FieldDescriptor f4014g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f4009b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f4010c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f4011d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f4012e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("contourDetectedFaces");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f4013f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("nonContourDetectedFaces");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f4014g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzll zzllVar = (zzll) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f4009b, zzllVar.zzc());
        objectEncoderContext.add(f4010c, (Object) null);
        objectEncoderContext.add(f4011d, zzllVar.zzb());
        objectEncoderContext.add(f4012e, zzllVar.zza());
        objectEncoderContext.add(f4013f, zzllVar.zzd());
        objectEncoderContext.add(f4014g, zzllVar.zze());
    }
}