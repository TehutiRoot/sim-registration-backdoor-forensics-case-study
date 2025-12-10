package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Op2 */
/* loaded from: classes3.dex */
public final class Op2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Op2 f4509a = new Op2();

    /* renamed from: b */
    public static final FieldDescriptor f4510b;

    /* renamed from: c */
    public static final FieldDescriptor f4511c;

    /* renamed from: d */
    public static final FieldDescriptor f4512d;

    /* renamed from: e */
    public static final FieldDescriptor f4513e;

    /* renamed from: f */
    public static final FieldDescriptor f4514f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("remoteModelOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f4510b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("localModelOptions");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f4511c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCodes");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f4512d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("modelInitializationMs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f4513e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("isNnApiEnabled");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f4514f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjr zzjrVar = (zzjr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
