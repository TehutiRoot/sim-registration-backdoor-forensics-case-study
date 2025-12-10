package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzod;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: RA2 */
/* loaded from: classes3.dex */
public final class RA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final RA2 f5420a = new RA2();

    /* renamed from: b */
    public static final FieldDescriptor f5421b;

    /* renamed from: c */
    public static final FieldDescriptor f5422c;

    /* renamed from: d */
    public static final FieldDescriptor f5423d;

    /* renamed from: e */
    public static final FieldDescriptor f5424e;

    /* renamed from: f */
    public static final FieldDescriptor f5425f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("remoteModelOptions");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f5421b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("localModelOptions");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f5422c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCodes");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f5423d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("modelInitializationMs");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f5424e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("isNnApiEnabled");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f5425f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzod zzodVar = (zzod) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}