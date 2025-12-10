package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgs;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Cx2 */
/* loaded from: classes3.dex */
public final class Cx2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Cx2 f883a = new Cx2();

    /* renamed from: b */
    public static final FieldDescriptor f884b;

    /* renamed from: c */
    public static final FieldDescriptor f885c;

    /* renamed from: d */
    public static final FieldDescriptor f886d;

    /* renamed from: e */
    public static final FieldDescriptor f887e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f884b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f885c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f886d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f887e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzgs zzgsVar = (zzgs) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}