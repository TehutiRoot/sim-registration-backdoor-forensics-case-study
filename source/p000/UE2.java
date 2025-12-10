package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqx;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: UE2 */
/* loaded from: classes3.dex */
public final class UE2 implements ObjectEncoder {

    /* renamed from: a */
    public static final UE2 f6261a = new UE2();

    /* renamed from: b */
    public static final FieldDescriptor f6262b;

    /* renamed from: c */
    public static final FieldDescriptor f6263c;

    /* renamed from: d */
    public static final FieldDescriptor f6264d;

    /* renamed from: e */
    public static final FieldDescriptor f6265e;

    /* renamed from: f */
    public static final FieldDescriptor f6266f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f6262b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f6263c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("captionCount");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(4);
        f6264d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("highestScore");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(5);
        f6265e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageType");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(6);
        f6266f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqx zzqxVar = (zzqx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
