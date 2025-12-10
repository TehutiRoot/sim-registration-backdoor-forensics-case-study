package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: BF2 */
/* loaded from: classes3.dex */
public final class BF2 implements ObjectEncoder {

    /* renamed from: a */
    public static final BF2 f335a = new BF2();

    /* renamed from: b */
    public static final FieldDescriptor f336b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("optionsType");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f336b = builder.withProperty(zzfcVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrg zzrgVar = (zzrg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
