package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: yG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23109yG2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23109yG2 f108664a = new C23109yG2();

    /* renamed from: b */
    public static final FieldDescriptor f108665b;

    /* renamed from: c */
    public static final FieldDescriptor f108666c;

    /* renamed from: d */
    public static final FieldDescriptor f108667d;

    /* renamed from: e */
    public static final FieldDescriptor f108668e;

    /* renamed from: f */
    public static final FieldDescriptor f108669f;

    /* renamed from: g */
    public static final FieldDescriptor f108670g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f108665b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f108666c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("detectorOptions");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f108667d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loadDurationMs");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f108668e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("sessionDurationMs");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f108669f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("sessionTotalInferenceDurationMs");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f108670g = builder6.withProperty(zzfcVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrp zzrpVar = (zzrp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
