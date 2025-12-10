package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpt;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: PC2 */
/* loaded from: classes3.dex */
public final class PC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final PC2 f4674a = new PC2();

    /* renamed from: b */
    public static final FieldDescriptor f4675b;

    /* renamed from: c */
    public static final FieldDescriptor f4676c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("eventType");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f4675b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f4676c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpt zzptVar = (zzpt) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
