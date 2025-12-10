package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Yt2 */
/* loaded from: classes3.dex */
public final class Yt2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Yt2 f7889a = new Yt2();

    /* renamed from: b */
    public static final FieldDescriptor f7890b;

    /* renamed from: c */
    public static final FieldDescriptor f7891c;

    /* renamed from: d */
    public static final FieldDescriptor f7892d;

    /* renamed from: e */
    public static final FieldDescriptor f7893e;

    /* renamed from: f */
    public static final FieldDescriptor f7894f;

    /* renamed from: g */
    public static final FieldDescriptor f7895g;

    /* renamed from: h */
    public static final FieldDescriptor f7896h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7890b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7891c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f7892d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f7893e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("options");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f7894f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("detectedBarcodeFormats");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f7895g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("detectedBarcodeValueTypes");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f7896h = builder7.withProperty(zzfcVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzfv zzfvVar = (zzfv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f7890b, zzfvVar.zzc());
        objectEncoderContext.add(f7891c, (Object) null);
        objectEncoderContext.add(f7892d, zzfvVar.zze());
        objectEncoderContext.add(f7893e, (Object) null);
        objectEncoderContext.add(f7894f, zzfvVar.zzd());
        objectEncoderContext.add(f7895g, zzfvVar.zza());
        objectEncoderContext.add(f7896h, zzfvVar.zzb());
    }
}
