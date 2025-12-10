package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzql;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ZD2 */
/* loaded from: classes3.dex */
public final class ZD2 implements ObjectEncoder {

    /* renamed from: a */
    public static final ZD2 f7983a = new ZD2();

    /* renamed from: b */
    public static final FieldDescriptor f7984b;

    /* renamed from: c */
    public static final FieldDescriptor f7985c;

    /* renamed from: d */
    public static final FieldDescriptor f7986d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7984b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("params");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7985c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f7986d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzql zzqlVar = (zzql) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
