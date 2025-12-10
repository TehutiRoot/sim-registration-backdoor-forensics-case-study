package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzlo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ut2 */
/* loaded from: classes3.dex */
public final class Ut2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ut2 f6480a = new Ut2();

    /* renamed from: b */
    public static final FieldDescriptor f6481b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f6481b = builder.withProperty(zzcqVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(f6481b, ((zzlo) obj).zza());
    }
}
