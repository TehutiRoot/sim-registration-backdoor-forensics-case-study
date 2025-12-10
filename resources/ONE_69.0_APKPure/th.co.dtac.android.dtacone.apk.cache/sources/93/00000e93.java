package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: PI2 */
/* loaded from: classes3.dex */
public final class PI2 implements ObjectEncoder {

    /* renamed from: a */
    public static final PI2 f4753a = new PI2();

    /* renamed from: b */
    public static final FieldDescriptor f4754b;

    /* renamed from: c */
    public static final FieldDescriptor f4755c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f4754b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("textDetectionOptions");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f4755c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsm zzsmVar = (zzsm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}