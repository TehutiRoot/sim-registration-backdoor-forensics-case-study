package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrt;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: RG2 */
/* loaded from: classes3.dex */
public final class RG2 implements ObjectEncoder {

    /* renamed from: a */
    public static final RG2 f5312a = new RG2();

    /* renamed from: b */
    public static final FieldDescriptor f5313b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f5313b = builder.withProperty(zzfcVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrt zzrtVar = (zzrt) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
