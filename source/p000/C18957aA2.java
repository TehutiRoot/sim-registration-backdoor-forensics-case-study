package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzss;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: aA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18957aA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18957aA2 f8253a = new C18957aA2();

    /* renamed from: b */
    public static final FieldDescriptor f8254b;

    /* renamed from: c */
    public static final FieldDescriptor f8255c;

    /* renamed from: d */
    public static final FieldDescriptor f8256d;

    /* renamed from: e */
    public static final FieldDescriptor f8257e;

    /* renamed from: f */
    public static final FieldDescriptor f8258f;

    /* renamed from: g */
    public static final FieldDescriptor f8259g;

    /* renamed from: h */
    public static final FieldDescriptor f8260h;

    /* renamed from: i */
    public static final FieldDescriptor f8261i;

    /* renamed from: j */
    public static final FieldDescriptor f8262j;

    /* renamed from: k */
    public static final FieldDescriptor f8263k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f8254b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("osBuild");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f8255c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("brand");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f8256d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("device");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f8257e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hardware");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f8258f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("manufacturer");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f8259g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("model");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f8260h = builder7.withProperty(zzfcVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("product");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        f8261i = builder8.withProperty(zzfcVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("soc");
        zzfc zzfcVar9 = new zzfc();
        zzfcVar9.zza(9);
        f8262j = builder9.withProperty(zzfcVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("socMetaBuildId");
        zzfc zzfcVar10 = new zzfc();
        zzfcVar10.zza(10);
        f8263k = builder10.withProperty(zzfcVar10.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzss zzssVar = (zzss) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
