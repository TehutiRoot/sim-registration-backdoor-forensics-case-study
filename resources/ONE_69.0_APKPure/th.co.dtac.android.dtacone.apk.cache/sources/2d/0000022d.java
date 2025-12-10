package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: CE2 */
/* loaded from: classes3.dex */
public final class CE2 implements ObjectEncoder {

    /* renamed from: a */
    public static final CE2 f689a = new CE2();

    /* renamed from: b */
    public static final FieldDescriptor f690b;

    /* renamed from: c */
    public static final FieldDescriptor f691c;

    /* renamed from: d */
    public static final FieldDescriptor f692d;

    /* renamed from: e */
    public static final FieldDescriptor f693e;

    /* renamed from: f */
    public static final FieldDescriptor f694f;

    /* renamed from: g */
    public static final FieldDescriptor f695g;

    /* renamed from: h */
    public static final FieldDescriptor f696h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f690b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f691c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f692d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("documentPresenceConfidence");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f693e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("documentCornerConfidence");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f694f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("documentRotationSuggestionDegrees");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f695g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("documentRotationSuggestionConfidence");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f696h = builder7.withProperty(zzfcVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqi zzqiVar = (zzqi) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}