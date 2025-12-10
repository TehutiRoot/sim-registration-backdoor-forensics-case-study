package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznj;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Dz2 */
/* loaded from: classes3.dex */
public final class Dz2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Dz2 f1216a = new Dz2();

    /* renamed from: b */
    public static final FieldDescriptor f1217b;

    /* renamed from: c */
    public static final FieldDescriptor f1218c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("metric");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f1217b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("result");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f1218c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznj zznjVar = (zznj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}