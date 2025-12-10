package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmi;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: sw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22189sw2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22189sw2 f79946a = new C22189sw2();

    /* renamed from: b */
    public static final FieldDescriptor f79947b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("isFaceMeshEnabled");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f79947b = builder.withProperty(zzcqVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmi zzmiVar = (zzmi) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
