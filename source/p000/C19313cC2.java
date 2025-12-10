package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpe;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: cC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19313cC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19313cC2 f39362a = new C19313cC2();

    /* renamed from: b */
    public static final FieldDescriptor f39363b;

    /* renamed from: c */
    public static final FieldDescriptor f39364c;

    /* renamed from: d */
    public static final FieldDescriptor f39365d;

    /* renamed from: e */
    public static final FieldDescriptor f39366e;

    /* renamed from: f */
    public static final FieldDescriptor f39367f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f39363b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("latencyMs");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f39364c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("burstCount");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f39365d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("estimatedCaptureLatencyMs");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f39366e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f39367f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpe zzpeVar = (zzpe) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
