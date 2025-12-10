package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: DG2 */
/* loaded from: classes3.dex */
public final class DG2 implements ObjectEncoder {

    /* renamed from: a */
    public static final DG2 f953a = new DG2();

    /* renamed from: b */
    public static final FieldDescriptor f954b;

    /* renamed from: c */
    public static final FieldDescriptor f955c;

    /* renamed from: d */
    public static final FieldDescriptor f956d;

    /* renamed from: e */
    public static final FieldDescriptor f957e;

    /* renamed from: f */
    public static final FieldDescriptor f958f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f954b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("personDetectionMode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f955c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("landmarkDetectionMode");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f956d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("preferredHardwareConfigs");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f957e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("runConfig");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f958f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrq zzrqVar = (zzrq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
