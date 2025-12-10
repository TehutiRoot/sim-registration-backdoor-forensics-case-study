package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zziy;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Lo2 */
/* loaded from: classes3.dex */
public final class Lo2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Lo2 f3699a = new Lo2();

    /* renamed from: b */
    public static final FieldDescriptor f3700b;

    /* renamed from: c */
    public static final FieldDescriptor f3701c;

    /* renamed from: d */
    public static final FieldDescriptor f3702d;

    /* renamed from: e */
    public static final FieldDescriptor f3703e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3700b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f3701c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("eventType");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f3702d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f3703e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zziy zziyVar = (zziy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}