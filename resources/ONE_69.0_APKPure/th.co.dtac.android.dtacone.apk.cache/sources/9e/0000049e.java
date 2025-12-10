package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Er2 */
/* loaded from: classes3.dex */
public final class Er2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Er2 f1467a = new Er2();

    /* renamed from: b */
    public static final FieldDescriptor f1468b;

    /* renamed from: c */
    public static final FieldDescriptor f1469c;

    /* renamed from: d */
    public static final FieldDescriptor f1470d;

    /* renamed from: e */
    public static final FieldDescriptor f1471e;

    /* renamed from: f */
    public static final FieldDescriptor f1472f;

    /* renamed from: g */
    public static final FieldDescriptor f1473g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("mode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f1468b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("landmark");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f1469c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classification");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f1470d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("prominentFaceOnly");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f1471e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tracking");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f1472f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("minFaceSize");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f1473g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznn zznnVar = (zznn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}