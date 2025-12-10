package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzti;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: CA2 */
/* loaded from: classes3.dex */
public final class CA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final CA2 f627a = new CA2();

    /* renamed from: b */
    public static final FieldDescriptor f628b;

    /* renamed from: c */
    public static final FieldDescriptor f629c;

    /* renamed from: d */
    public static final FieldDescriptor f630d;

    /* renamed from: e */
    public static final FieldDescriptor f631e;

    /* renamed from: f */
    public static final FieldDescriptor f632f;

    /* renamed from: g */
    public static final FieldDescriptor f633g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("mode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f628b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("landmark");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f629c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("classification");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f630d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("prominentFaceOnly");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f631e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tracking");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f632f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("minFaceSize");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f633g = builder6.withProperty(zzfcVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzti zztiVar = (zzti) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
