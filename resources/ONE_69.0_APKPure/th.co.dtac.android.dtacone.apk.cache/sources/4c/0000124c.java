package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: TD2 */
/* loaded from: classes3.dex */
public final class TD2 implements ObjectEncoder {

    /* renamed from: a */
    public static final TD2 f6292a = new TD2();

    /* renamed from: b */
    public static final FieldDescriptor f6293b;

    /* renamed from: c */
    public static final FieldDescriptor f6294c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("deviceInfos");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f6293b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorInfo");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f6294c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsw zzswVar = (zzsw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}