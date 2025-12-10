package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zztb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: YI2 */
/* loaded from: classes3.dex */
public final class YI2 implements ObjectEncoder {

    /* renamed from: a */
    public static final YI2 f7838a = new YI2();

    /* renamed from: b */
    public static final FieldDescriptor f7839b;

    /* renamed from: c */
    public static final FieldDescriptor f7840c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("metric");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7839b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("result");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7840c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zztb zztbVar = (zztb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}