package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: FD2 */
/* loaded from: classes3.dex */
public final class FD2 implements ObjectEncoder {

    /* renamed from: a */
    public static final FD2 f1542a = new FD2();

    /* renamed from: b */
    public static final FieldDescriptor f1543b;

    /* renamed from: c */
    public static final FieldDescriptor f1544c;

    /* renamed from: d */
    public static final FieldDescriptor f1545d;

    /* renamed from: e */
    public static final FieldDescriptor f1546e;

    /* renamed from: f */
    public static final FieldDescriptor f1547f;

    /* renamed from: g */
    public static final FieldDescriptor f1548g;

    /* renamed from: h */
    public static final FieldDescriptor f1549h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f1543b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f1544c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f1545d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("documentPresenceConfidence");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f1546e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("documentCornerConfidence");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f1547f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("documentRotationSuggestionDegrees");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f1548g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("documentRotationSuggestionConfidence");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f1549h = builder7.withProperty(zzfcVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqi zzqiVar = (zzqi) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
