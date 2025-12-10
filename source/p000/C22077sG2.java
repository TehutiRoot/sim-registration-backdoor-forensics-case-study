package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: sG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22077sG2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22077sG2 f79743a = new C22077sG2();

    /* renamed from: b */
    public static final FieldDescriptor f79744b;

    /* renamed from: c */
    public static final FieldDescriptor f79745c;

    /* renamed from: d */
    public static final FieldDescriptor f79746d;

    /* renamed from: e */
    public static final FieldDescriptor f79747e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f79744b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f79745c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("detectorOptions");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f79746d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("objectInfos");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f79747e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrn zzrnVar = (zzrn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
