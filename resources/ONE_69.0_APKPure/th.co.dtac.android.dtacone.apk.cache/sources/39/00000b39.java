package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Lq2 */
/* loaded from: classes3.dex */
public final class Lq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Lq2 f3709a = new Lq2();

    /* renamed from: b */
    public static final FieldDescriptor f3710b;

    /* renamed from: c */
    public static final FieldDescriptor f3711c;

    /* renamed from: d */
    public static final FieldDescriptor f3712d;

    /* renamed from: e */
    public static final FieldDescriptor f3713e;

    /* renamed from: f */
    public static final FieldDescriptor f3714f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("remoteModelOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3710b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("localModelOptions");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f3711c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCodes");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f3712d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("modelInitializationMs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f3713e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("isNnApiEnabled");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f3714f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjr zzjrVar = (zzjr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}