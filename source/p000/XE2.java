package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqy;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: XE2 */
/* loaded from: classes3.dex */
public final class XE2 implements ObjectEncoder {

    /* renamed from: a */
    public static final XE2 f7420a = new XE2();

    /* renamed from: b */
    public static final FieldDescriptor f7421b;

    /* renamed from: c */
    public static final FieldDescriptor f7422c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7421b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("durationMs");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7422c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqy zzqyVar = (zzqy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
