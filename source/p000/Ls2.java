package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzne;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ls2 */
/* loaded from: classes3.dex */
public final class Ls2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ls2 f3616a = new Ls2();

    /* renamed from: b */
    public static final FieldDescriptor f3617b;

    /* renamed from: c */
    public static final FieldDescriptor f3618c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("deviceInfos");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3617b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorInfo");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f3618c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzne zzneVar = (zzne) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
