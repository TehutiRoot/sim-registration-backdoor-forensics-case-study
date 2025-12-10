package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrm;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: nG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21217nG2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21217nG2 f72175a = new C21217nG2();

    /* renamed from: b */
    public static final FieldDescriptor f72176b;

    /* renamed from: c */
    public static final FieldDescriptor f72177c;

    /* renamed from: d */
    public static final FieldDescriptor f72178d;

    /* renamed from: e */
    public static final FieldDescriptor f72179e;

    /* renamed from: f */
    public static final FieldDescriptor f72180f;

    /* renamed from: g */
    public static final FieldDescriptor f72181g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f72176b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("multipleObjectsEnabled");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f72177c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classificationEnabled");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f72178d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("maxPerObjectLabelCount");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f72179e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("classificationConfidenceThreshold");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f72180f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("customLocalModelOptions");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f72181g = builder6.withProperty(zzfcVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrm zzrmVar = (zzrm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
