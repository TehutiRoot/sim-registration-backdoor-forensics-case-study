package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznl;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: My2 */
/* loaded from: classes3.dex */
public final class My2 implements ObjectEncoder {

    /* renamed from: a */
    public static final My2 f3965a = new My2();

    /* renamed from: b */
    public static final FieldDescriptor f3966b;

    /* renamed from: c */
    public static final FieldDescriptor f3967c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("result");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3966b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("ok");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f3967c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznl zznlVar = (zznl) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
