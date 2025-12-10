package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrs;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: IG2 */
/* loaded from: classes3.dex */
public final class IG2 implements ObjectEncoder {

    /* renamed from: a */
    public static final IG2 f2463a = new IG2();

    /* renamed from: b */
    public static final FieldDescriptor f2464b;

    /* renamed from: c */
    public static final FieldDescriptor f2465c;

    /* renamed from: d */
    public static final FieldDescriptor f2466d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f2464b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("streamModeSmoothingRatio");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f2465c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("rawSizeMaskEnabled");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f2466d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrs zzrsVar = (zzrs) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
