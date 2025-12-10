package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Hq2 */
/* loaded from: classes3.dex */
public final class Hq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Hq2 f2324a = new Hq2();

    /* renamed from: b */
    public static final FieldDescriptor f2325b;

    /* renamed from: c */
    public static final FieldDescriptor f2326c;

    /* renamed from: d */
    public static final FieldDescriptor f2327d;

    /* renamed from: e */
    public static final FieldDescriptor f2328e;

    /* renamed from: f */
    public static final FieldDescriptor f2329f;

    /* renamed from: g */
    public static final FieldDescriptor f2330g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("mode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f2325b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("landmark");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f2326c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classification");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f2327d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("prominentFaceOnly");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f2328e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tracking");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f2329f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("minFaceSize");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f2330g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznn zznnVar = (zznn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
