package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzss;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: XA2 */
/* loaded from: classes3.dex */
public final class XA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final XA2 f7486a = new XA2();

    /* renamed from: b */
    public static final FieldDescriptor f7487b;

    /* renamed from: c */
    public static final FieldDescriptor f7488c;

    /* renamed from: d */
    public static final FieldDescriptor f7489d;

    /* renamed from: e */
    public static final FieldDescriptor f7490e;

    /* renamed from: f */
    public static final FieldDescriptor f7491f;

    /* renamed from: g */
    public static final FieldDescriptor f7492g;

    /* renamed from: h */
    public static final FieldDescriptor f7493h;

    /* renamed from: i */
    public static final FieldDescriptor f7494i;

    /* renamed from: j */
    public static final FieldDescriptor f7495j;

    /* renamed from: k */
    public static final FieldDescriptor f7496k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7487b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("osBuild");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7488c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("brand");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f7489d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("device");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f7490e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hardware");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f7491f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("manufacturer");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f7492g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("model");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f7493h = builder7.withProperty(zzfcVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("product");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        f7494i = builder8.withProperty(zzfcVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("soc");
        zzfc zzfcVar9 = new zzfc();
        zzfcVar9.zza(9);
        f7495j = builder9.withProperty(zzfcVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("socMetaBuildId");
        zzfc zzfcVar10 = new zzfc();
        zzfcVar10.zza(10);
        f7496k = builder10.withProperty(zzfcVar10.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzss zzssVar = (zzss) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}