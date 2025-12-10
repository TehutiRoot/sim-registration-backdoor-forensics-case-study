package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* renamed from: AC2 */
/* loaded from: classes3.dex */
public final class AC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final AC2 f44a = new AC2();

    /* renamed from: b */
    public static final FieldDescriptor f45b;

    /* renamed from: c */
    public static final FieldDescriptor f46c;

    /* renamed from: d */
    public static final FieldDescriptor f47d;

    /* renamed from: e */
    public static final FieldDescriptor f48e;

    /* renamed from: f */
    public static final FieldDescriptor f49f;

    /* renamed from: g */
    public static final FieldDescriptor f50g;

    /* renamed from: h */
    public static final FieldDescriptor f51h;

    /* renamed from: i */
    public static final FieldDescriptor f52i;

    /* renamed from: j */
    public static final FieldDescriptor f53j;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f45b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f46c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("source");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f47d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("uri");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f48e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hash");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f49f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("modelType");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f50g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("size");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f51h = builder7.withProperty(zzfcVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("hasLabelMap");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        f52i = builder8.withProperty(zzfcVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("isManifestModel");
        zzfc zzfcVar9 = new zzfc();
        zzfcVar9.zza(9);
        f53j = builder9.withProperty(zzfcVar9.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpp zzppVar = (zzpp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
