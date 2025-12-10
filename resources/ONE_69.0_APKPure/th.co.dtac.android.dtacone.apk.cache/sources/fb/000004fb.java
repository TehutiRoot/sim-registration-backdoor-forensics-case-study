package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: FD2 */
/* loaded from: classes3.dex */
public final class FD2 implements ObjectEncoder {

    /* renamed from: a */
    public static final FD2 f1617a = new FD2();

    /* renamed from: b */
    public static final FieldDescriptor f1618b;

    /* renamed from: c */
    public static final FieldDescriptor f1619c;

    /* renamed from: d */
    public static final FieldDescriptor f1620d;

    /* renamed from: e */
    public static final FieldDescriptor f1621e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("isChargingRequired");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f1618b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isWifiRequired");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f1619c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isDeviceIdleRequired");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f1620d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("canDownloadInBackground");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f1621e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpq zzpqVar = (zzpq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}