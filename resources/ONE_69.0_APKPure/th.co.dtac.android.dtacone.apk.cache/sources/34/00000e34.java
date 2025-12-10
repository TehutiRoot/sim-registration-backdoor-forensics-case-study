package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmf;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ow2 */
/* loaded from: classes3.dex */
public final class Ow2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ow2 f4621a = new Ow2();

    /* renamed from: b */
    public static final FieldDescriptor f4622b;

    /* renamed from: c */
    public static final FieldDescriptor f4623c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f4622b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f4623c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmf zzmfVar = (zzmf) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}