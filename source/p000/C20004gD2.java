package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: gD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20004gD2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20004gD2 f62085a = new C20004gD2();

    /* renamed from: b */
    public static final FieldDescriptor f62086b;

    /* renamed from: c */
    public static final FieldDescriptor f62087c;

    /* renamed from: d */
    public static final FieldDescriptor f62088d;

    /* renamed from: e */
    public static final FieldDescriptor f62089e;

    /* renamed from: f */
    public static final FieldDescriptor f62090f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f62086b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f62087c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("detectedBarcodeFormats");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f62088d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectedBarcodeValueTypes");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f62089e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f62090f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpz zzpzVar = (zzpz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f62086b, zzpzVar.zzd());
        objectEncoderContext.add(f62087c, zzpzVar.zze());
        objectEncoderContext.add(f62088d, zzpzVar.zza());
        objectEncoderContext.add(f62089e, zzpzVar.zzb());
        objectEncoderContext.add(f62090f, zzpzVar.zzc());
    }
}
