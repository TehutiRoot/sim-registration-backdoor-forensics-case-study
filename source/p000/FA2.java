package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzst;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* renamed from: FA2 */
/* loaded from: classes3.dex */
public final class FA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final FA2 f1519a = new FA2();

    /* renamed from: b */
    public static final FieldDescriptor f1520b;

    /* renamed from: c */
    public static final FieldDescriptor f1521c;

    /* renamed from: d */
    public static final FieldDescriptor f1522d;

    /* renamed from: e */
    public static final FieldDescriptor f1523e;

    /* renamed from: f */
    public static final FieldDescriptor f1524f;

    /* renamed from: g */
    public static final FieldDescriptor f1525g;

    /* renamed from: h */
    public static final FieldDescriptor f1526h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("renderer");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f1520b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("vendor");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f1521c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f1522d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("maxImages");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f1523e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("maxSsbo");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f1524f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("workGroupSizes");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f1525g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f1526h = builder7.withProperty(zzfcVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzst zzstVar = (zzst) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
