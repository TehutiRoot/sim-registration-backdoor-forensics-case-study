package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ku2 */
/* loaded from: classes3.dex */
public final class Ku2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ku2 f3440a = new Ku2();

    /* renamed from: b */
    public static final FieldDescriptor f3441b;

    /* renamed from: c */
    public static final FieldDescriptor f3442c;

    /* renamed from: d */
    public static final FieldDescriptor f3443d;

    /* renamed from: e */
    public static final FieldDescriptor f3444e;

    /* renamed from: f */
    public static final FieldDescriptor f3445f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f3441b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f3442c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputsFormats");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f3443d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputFormats");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f3444e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("options");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f3445f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzfq zzfqVar = (zzfq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}