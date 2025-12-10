package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqu;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: IF2 */
/* loaded from: classes3.dex */
public final class IF2 implements ObjectEncoder {

    /* renamed from: a */
    public static final IF2 f2623a = new IF2();

    /* renamed from: b */
    public static final FieldDescriptor f2624b;

    /* renamed from: c */
    public static final FieldDescriptor f2625c;

    /* renamed from: d */
    public static final FieldDescriptor f2626d;

    /* renamed from: e */
    public static final FieldDescriptor f2627e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f2624b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("detectorOptions");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f2625c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f2626d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectedFaces");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f2627e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqu zzquVar = (zzqu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}