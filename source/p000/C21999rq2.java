package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: rq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21999rq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21999rq2 f77420a = new C21999rq2();

    /* renamed from: b */
    public static final FieldDescriptor f77421b;

    /* renamed from: c */
    public static final FieldDescriptor f77422c;

    /* renamed from: d */
    public static final FieldDescriptor f77423d;

    /* renamed from: e */
    public static final FieldDescriptor f77424e;

    /* renamed from: f */
    public static final FieldDescriptor f77425f;

    /* renamed from: g */
    public static final FieldDescriptor f77426g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxMs");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f77421b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("minMs");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f77422c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("avgMs");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f77423d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("firstQuartileMs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f77424e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("medianMs");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f77425f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("thirdQuartileMs");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f77426g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjv zzjvVar = (zzjv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f77421b, zzjvVar.zzc());
        objectEncoderContext.add(f77422c, zzjvVar.zze());
        objectEncoderContext.add(f77423d, zzjvVar.zza());
        objectEncoderContext.add(f77424e, zzjvVar.zzb());
        objectEncoderContext.add(f77425f, zzjvVar.zzd());
        objectEncoderContext.add(f77426g, zzjvVar.zzf());
    }
}
