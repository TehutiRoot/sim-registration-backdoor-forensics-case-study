package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzko;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Bs2 */
/* loaded from: classes3.dex */
public final class Bs2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Bs2 f572a = new Bs2();

    /* renamed from: b */
    public static final FieldDescriptor f573b;

    /* renamed from: c */
    public static final FieldDescriptor f574c;

    /* renamed from: d */
    public static final FieldDescriptor f575d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f573b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f574c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f575d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzko zzkoVar = (zzko) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}