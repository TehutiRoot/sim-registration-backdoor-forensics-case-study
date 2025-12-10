package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgs;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Fw2 */
/* loaded from: classes3.dex */
public final class Fw2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Fw2 f1758a = new Fw2();

    /* renamed from: b */
    public static final FieldDescriptor f1759b;

    /* renamed from: c */
    public static final FieldDescriptor f1760c;

    /* renamed from: d */
    public static final FieldDescriptor f1761d;

    /* renamed from: e */
    public static final FieldDescriptor f1762e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f1759b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f1760c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f1761d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f1762e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzgs zzgsVar = (zzgs) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
