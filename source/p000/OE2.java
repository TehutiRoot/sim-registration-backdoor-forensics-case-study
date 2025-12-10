package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: OE2 */
/* loaded from: classes3.dex */
public final class OE2 implements ObjectEncoder {

    /* renamed from: a */
    public static final OE2 f4346a = new OE2();

    /* renamed from: b */
    public static final FieldDescriptor f4347b;

    /* renamed from: c */
    public static final FieldDescriptor f4348c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("isFaceMeshEnabled");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f4347b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("useCase");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f4348c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqv zzqvVar = (zzqv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
