package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: TI2 */
/* loaded from: classes3.dex */
public final class TI2 implements ObjectEncoder {

    /* renamed from: a */
    public static final TI2 f6311a = new TI2();

    /* renamed from: b */
    public static final FieldDescriptor f6312b;

    /* renamed from: c */
    public static final FieldDescriptor f6313c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("language");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f6312b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f6313c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsp zzspVar = (zzsp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}