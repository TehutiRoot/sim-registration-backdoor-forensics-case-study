package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Dp2 */
/* loaded from: classes3.dex */
public final class Dp2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Dp2 f1118a = new Dp2();

    /* renamed from: b */
    public static final FieldDescriptor f1119b;

    /* renamed from: c */
    public static final FieldDescriptor f1120c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("type");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f1119b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("dims");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f1120c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjp zzjpVar = (zzjp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
