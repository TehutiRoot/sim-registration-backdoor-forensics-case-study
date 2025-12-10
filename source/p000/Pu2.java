package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgf;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Pu2 */
/* loaded from: classes3.dex */
public final class Pu2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Pu2 f4897a = new Pu2();

    /* renamed from: b */
    public static final FieldDescriptor f4898b;

    /* renamed from: c */
    public static final FieldDescriptor f4899c;

    /* renamed from: d */
    public static final FieldDescriptor f4900d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f4898b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f4899c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f4900d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzgf zzgfVar = (zzgf) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
