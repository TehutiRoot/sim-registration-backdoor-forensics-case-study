package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: UH2 */
/* loaded from: classes3.dex */
public final class UH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final UH2 f6274a = new UH2();

    /* renamed from: b */
    public static final FieldDescriptor f6275b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectionType");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f6275b = builder.withProperty(zzfcVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsn zzsnVar = (zzsn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
