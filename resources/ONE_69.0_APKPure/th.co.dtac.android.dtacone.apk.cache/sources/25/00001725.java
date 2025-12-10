package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: YF2 */
/* loaded from: classes3.dex */
public final class YF2 implements ObjectEncoder {

    /* renamed from: a */
    public static final YF2 f7815a = new YF2();

    /* renamed from: b */
    public static final FieldDescriptor f7816b;

    /* renamed from: c */
    public static final FieldDescriptor f7817c;

    /* renamed from: d */
    public static final FieldDescriptor f7818d;

    /* renamed from: e */
    public static final FieldDescriptor f7819e;

    /* renamed from: f */
    public static final FieldDescriptor f7820f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7816b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7817c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f7818d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("labelCount");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f7819e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("highestConfidence");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f7820f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzra zzraVar = (zzra) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}