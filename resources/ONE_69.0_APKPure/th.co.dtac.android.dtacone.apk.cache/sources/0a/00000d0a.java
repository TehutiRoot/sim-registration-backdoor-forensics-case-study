package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Nm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18167Nm2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18167Nm2 f4259a = new C18167Nm2();

    /* renamed from: b */
    public static final FieldDescriptor f4260b;

    /* renamed from: c */
    public static final FieldDescriptor f4261c;

    /* renamed from: d */
    public static final FieldDescriptor f4262d;

    /* renamed from: e */
    public static final FieldDescriptor f4263e;

    /* renamed from: f */
    public static final FieldDescriptor f4264f;

    /* renamed from: g */
    public static final FieldDescriptor f4265g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f4260b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f4261c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f4262d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f4263e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("contourDetectedFaces");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f4264f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("nonContourDetectedFaces");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f4265g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdn zzdnVar = (zzdn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f4260b, zzdnVar.zzb());
        objectEncoderContext.add(f4261c, zzdnVar.zzc());
        objectEncoderContext.add(f4262d, (Object) null);
        objectEncoderContext.add(f4263e, zzdnVar.zza());
        objectEncoderContext.add(f4264f, zzdnVar.zzd());
        objectEncoderContext.add(f4265g, zzdnVar.zze());
    }
}