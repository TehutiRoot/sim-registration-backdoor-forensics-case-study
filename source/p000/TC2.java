package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* renamed from: TC2 */
/* loaded from: classes3.dex */
public final class TC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final TC2 f5956a = new TC2();

    /* renamed from: b */
    public static final FieldDescriptor f5957b;

    /* renamed from: c */
    public static final FieldDescriptor f5958c;

    /* renamed from: d */
    public static final FieldDescriptor f5959d;

    /* renamed from: e */
    public static final FieldDescriptor f5960e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f5957b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("type");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f5958c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f5959d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("featureLevel");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f5960e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsv zzsvVar = (zzsv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
