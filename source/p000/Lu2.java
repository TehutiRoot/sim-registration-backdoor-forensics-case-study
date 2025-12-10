package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzlu;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Lu2 */
/* loaded from: classes3.dex */
public final class Lu2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Lu2 f3626a = new Lu2();

    /* renamed from: b */
    public static final FieldDescriptor f3627b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifiedLanguage");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3627b = builder.withProperty(zzcqVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlu zzluVar = (zzlu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
