package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Uw2 */
/* loaded from: classes3.dex */
public final class Uw2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Uw2 f6758a = new Uw2();

    /* renamed from: b */
    public static final FieldDescriptor f6759b;

    /* renamed from: c */
    public static final FieldDescriptor f6760c;

    /* renamed from: d */
    public static final FieldDescriptor f6761d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f6759b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f6760c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("durationMs");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f6761d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmg zzmgVar = (zzmg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}