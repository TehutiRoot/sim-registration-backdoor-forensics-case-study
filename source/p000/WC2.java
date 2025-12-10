package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: WC2 */
/* loaded from: classes3.dex */
public final class WC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final WC2 f7164a = new WC2();

    /* renamed from: b */
    public static final FieldDescriptor f7165b;

    /* renamed from: c */
    public static final FieldDescriptor f7166c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("deviceInfos");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7165b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorInfo");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7166c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsw zzswVar = (zzsw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
