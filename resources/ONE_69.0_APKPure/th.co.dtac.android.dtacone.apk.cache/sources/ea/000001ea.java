package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzth;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: By2 */
/* loaded from: classes3.dex */
public final class By2 implements ObjectEncoder {

    /* renamed from: a */
    public static final By2 f600a = new By2();

    /* renamed from: b */
    public static final FieldDescriptor f601b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("format");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f601b = builder.withProperty(zzfcVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((ObjectEncoderContext) obj2).add(f601b, ((zzth) obj).zza());
    }
}