package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznm;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Un2 */
/* loaded from: classes3.dex */
public final class Un2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Un2 f6452a = new Un2();

    /* renamed from: b */
    public static final FieldDescriptor f6453b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("format");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f6453b = builder.withProperty(zzcqVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznm zznmVar = (zznm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
