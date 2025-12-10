package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznt;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ly2 */
/* loaded from: classes3.dex */
public final class Ly2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ly2 f3644a = new Ly2();

    /* renamed from: b */
    public static final FieldDescriptor f3645b;

    /* renamed from: c */
    public static final FieldDescriptor f3646c;

    /* renamed from: d */
    public static final FieldDescriptor f3647d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f3645b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f3646c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f3647d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznt zzntVar = (zznt) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
