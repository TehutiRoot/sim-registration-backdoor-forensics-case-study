package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Sq2 */
/* loaded from: classes3.dex */
public final class Sq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Sq2 f5714a = new Sq2();

    /* renamed from: b */
    public static final FieldDescriptor f5715b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f5715b = builder.withProperty(zzaeVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzko zzkoVar = (zzko) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
