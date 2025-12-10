package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: IC2 */
/* loaded from: classes3.dex */
public final class IC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final IC2 f2438a = new IC2();

    /* renamed from: b */
    public static final FieldDescriptor f2439b;

    /* renamed from: c */
    public static final FieldDescriptor f2440c;

    /* renamed from: d */
    public static final FieldDescriptor f2441d;

    /* renamed from: e */
    public static final FieldDescriptor f2442e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("isChargingRequired");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f2439b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isWifiRequired");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f2440c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isDeviceIdleRequired");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f2441d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("canDownloadInBackground");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f2442e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpq zzpqVar = (zzpq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
