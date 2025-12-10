package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: bF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19150bF2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19150bF2 f38983a = new C19150bF2();

    /* renamed from: b */
    public static final FieldDescriptor f38984b;

    /* renamed from: c */
    public static final FieldDescriptor f38985c;

    /* renamed from: d */
    public static final FieldDescriptor f38986d;

    /* renamed from: e */
    public static final FieldDescriptor f38987e;

    /* renamed from: f */
    public static final FieldDescriptor f38988f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f38984b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f38985c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f38986d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("labelCount");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f38987e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("highestConfidence");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f38988f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzra zzraVar = (zzra) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
