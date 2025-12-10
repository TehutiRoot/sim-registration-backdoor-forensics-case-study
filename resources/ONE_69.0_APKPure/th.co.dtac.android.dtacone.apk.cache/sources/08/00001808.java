package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpe;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ZC2 */
/* loaded from: classes3.dex */
public final class ZC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final ZC2 f8118a = new ZC2();

    /* renamed from: b */
    public static final FieldDescriptor f8119b;

    /* renamed from: c */
    public static final FieldDescriptor f8120c;

    /* renamed from: d */
    public static final FieldDescriptor f8121d;

    /* renamed from: e */
    public static final FieldDescriptor f8122e;

    /* renamed from: f */
    public static final FieldDescriptor f8123f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f8119b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("latencyMs");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f8120c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("burstCount");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f8121d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("estimatedCaptureLatencyMs");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f8122e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f8123f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpe zzpeVar = (zzpe) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}