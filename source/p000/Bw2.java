package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmj;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Bw2 */
/* loaded from: classes3.dex */
public final class Bw2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Bw2 f566a = new Bw2();

    /* renamed from: b */
    public static final FieldDescriptor f567b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f567b = builder.withProperty(zzcqVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmj zzmjVar = (zzmj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
