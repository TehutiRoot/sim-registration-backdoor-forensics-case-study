package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: WC2 */
/* loaded from: classes3.dex */
public final class WC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final WC2 f7218a = new WC2();

    /* renamed from: b */
    public static final FieldDescriptor f7219b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("api");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7219b = builder.withProperty(zzfcVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpd zzpdVar = (zzpd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}