package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznj;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Gy2 */
/* loaded from: classes3.dex */
public final class Gy2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Gy2 f2075a = new Gy2();

    /* renamed from: b */
    public static final FieldDescriptor f2076b;

    /* renamed from: c */
    public static final FieldDescriptor f2077c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("metric");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f2076b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("result");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f2077c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznj zznjVar = (zznj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
