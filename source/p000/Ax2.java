package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzni;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ax2 */
/* loaded from: classes3.dex */
public final class Ax2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ax2 f257a = new Ax2();

    /* renamed from: b */
    public static final FieldDescriptor f258b;

    /* renamed from: c */
    public static final FieldDescriptor f259c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("stageId");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f258b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("device");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f259c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzni zzniVar = (zzni) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
