package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Yx2 */
/* loaded from: classes3.dex */
public final class Yx2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Yx2 f8066a = new Yx2();

    /* renamed from: b */
    public static final FieldDescriptor f8067b;

    /* renamed from: c */
    public static final FieldDescriptor f8068c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorSpace");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f8067b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f8068c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmp zzmpVar = (zzmp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}