package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzot;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: VA2 */
/* loaded from: classes3.dex */
public final class VA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final VA2 f6574a = new VA2();

    /* renamed from: b */
    public static final FieldDescriptor f6575b;

    /* renamed from: c */
    public static final FieldDescriptor f6576c;

    /* renamed from: d */
    public static final FieldDescriptor f6577d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f6575b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f6576c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f6577d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzot zzotVar = (zzot) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
