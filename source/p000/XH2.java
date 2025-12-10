package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: XH2 */
/* loaded from: classes3.dex */
public final class XH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final XH2 f7444a = new XH2();

    /* renamed from: b */
    public static final FieldDescriptor f7445b;

    /* renamed from: c */
    public static final FieldDescriptor f7446c;

    /* renamed from: d */
    public static final FieldDescriptor f7447d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("language");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7445b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("durationMs");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7446c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f7447d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsq zzsqVar = (zzsq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
