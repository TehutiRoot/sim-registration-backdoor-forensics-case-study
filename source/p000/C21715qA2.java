package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzol;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: qA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21715qA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21715qA2 f76891a = new C21715qA2();

    /* renamed from: b */
    public static final FieldDescriptor f76892b;

    /* renamed from: c */
    public static final FieldDescriptor f76893c;

    /* renamed from: d */
    public static final FieldDescriptor f76894d;

    /* renamed from: e */
    public static final FieldDescriptor f76895e;

    /* renamed from: f */
    public static final FieldDescriptor f76896f;

    /* renamed from: g */
    public static final FieldDescriptor f76897g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxMs");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f76892b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("minMs");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f76893c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("avgMs");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f76894d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("firstQuartileMs");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f76895e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("medianMs");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f76896f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("thirdQuartileMs");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f76897g = builder6.withProperty(zzfcVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzol zzolVar = (zzol) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f76892b, zzolVar.zzc());
        objectEncoderContext.add(f76893c, zzolVar.zze());
        objectEncoderContext.add(f76894d, zzolVar.zza());
        objectEncoderContext.add(f76895e, zzolVar.zzb());
        objectEncoderContext.add(f76896f, zzolVar.zzd());
        objectEncoderContext.add(f76897g, zzolVar.zzf());
    }
}
