package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzld;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Qs2 */
/* loaded from: classes3.dex */
public final class Qs2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Qs2 f5187a = new Qs2();

    /* renamed from: b */
    public static final FieldDescriptor f5188b;

    /* renamed from: c */
    public static final FieldDescriptor f5189c;

    /* renamed from: d */
    public static final FieldDescriptor f5190d;

    /* renamed from: e */
    public static final FieldDescriptor f5191e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("category");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f5188b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationConfidence");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f5189c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("trackingId");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f5190d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("labelCount");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f5191e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzld zzldVar = (zzld) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
