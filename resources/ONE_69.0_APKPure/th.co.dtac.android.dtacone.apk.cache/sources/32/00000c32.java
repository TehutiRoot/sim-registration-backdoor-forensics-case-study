package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ms2 */
/* loaded from: classes3.dex */
public final class Ms2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ms2 f3993a = new Ms2();

    /* renamed from: b */
    public static final FieldDescriptor f3994b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("api");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3994b = builder.withProperty(zzcqVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkq zzkqVar = (zzkq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}