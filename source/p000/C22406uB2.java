package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: uB2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22406uB2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22406uB2 f107301a = new C22406uB2();

    /* renamed from: b */
    public static final FieldDescriptor f107302b;

    /* renamed from: c */
    public static final FieldDescriptor f107303c;

    /* renamed from: d */
    public static final FieldDescriptor f107304d;

    /* renamed from: e */
    public static final FieldDescriptor f107305e;

    /* renamed from: f */
    public static final FieldDescriptor f107306f;

    /* renamed from: g */
    public static final FieldDescriptor f107307g;

    /* renamed from: h */
    public static final FieldDescriptor f107308h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f107302b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageSource");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f107303c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageFormat");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f107304d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageByteSize");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f107305e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageWidth");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f107306f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("imageHeight");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f107307g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("rotationDegrees");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f107308h = builder7.withProperty(zzfcVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzoz zzozVar = (zzoz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
