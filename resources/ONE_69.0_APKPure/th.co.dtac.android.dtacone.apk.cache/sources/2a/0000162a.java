package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpu;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: XD2 */
/* loaded from: classes3.dex */
public final class XD2 implements ObjectEncoder {

    /* renamed from: a */
    public static final XD2 f7503a = new XD2();

    /* renamed from: b */
    public static final FieldDescriptor f7504b;

    /* renamed from: c */
    public static final FieldDescriptor f7505c;

    /* renamed from: d */
    public static final FieldDescriptor f7506d;

    /* renamed from: e */
    public static final FieldDescriptor f7507e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("category");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7504b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("classificationConfidence");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7505c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("trackingId");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f7506d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("labelCount");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f7507e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpu zzpuVar = (zzpu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}