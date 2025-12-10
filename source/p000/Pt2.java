package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Pt2 */
/* loaded from: classes3.dex */
public final class Pt2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Pt2 f4887a = new Pt2();

    /* renamed from: b */
    public static final FieldDescriptor f4888b;

    /* renamed from: c */
    public static final FieldDescriptor f4889c;

    /* renamed from: d */
    public static final FieldDescriptor f4890d;

    /* renamed from: e */
    public static final FieldDescriptor f4891e;

    /* renamed from: f */
    public static final FieldDescriptor f4892f;

    /* renamed from: g */
    public static final FieldDescriptor f4893g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f4888b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f4889c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f4890d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f4891e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("contourDetectedFaces");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f4892f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("nonContourDetectedFaces");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f4893g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzll zzllVar = (zzll) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f4888b, zzllVar.zzc());
        objectEncoderContext.add(f4889c, (Object) null);
        objectEncoderContext.add(f4890d, zzllVar.zzb());
        objectEncoderContext.add(f4891e, zzllVar.zza());
        objectEncoderContext.add(f4892f, zzllVar.zzd());
        objectEncoderContext.add(f4893g, zzllVar.zze());
    }
}
