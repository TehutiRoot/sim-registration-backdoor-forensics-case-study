package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznl;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Jz2 */
/* loaded from: classes3.dex */
public final class Jz2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Jz2 f3185a = new Jz2();

    /* renamed from: b */
    public static final FieldDescriptor f3186b;

    /* renamed from: c */
    public static final FieldDescriptor f3187c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("result");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3186b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("ok");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f3187c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznl zznlVar = (zznl) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}