package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzlc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Bs2 */
/* loaded from: classes3.dex */
public final class Bs2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Bs2 f548a = new Bs2();

    /* renamed from: b */
    public static final FieldDescriptor f549b;

    /* renamed from: c */
    public static final FieldDescriptor f550c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("eventType");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f549b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f550c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlc zzlcVar = (zzlc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
