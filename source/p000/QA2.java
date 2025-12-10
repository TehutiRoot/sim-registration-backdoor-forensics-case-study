package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzos;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: QA2 */
/* loaded from: classes3.dex */
public final class QA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final QA2 f4980a = new QA2();

    /* renamed from: b */
    public static final FieldDescriptor f4981b;

    /* renamed from: c */
    public static final FieldDescriptor f4982c;

    /* renamed from: d */
    public static final FieldDescriptor f4983d;

    /* renamed from: e */
    public static final FieldDescriptor f4984e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("imageFormat");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f4981b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("originalImageSize");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f4982c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("compressedImageSize");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f4983d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isOdmlImage");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f4984e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzos zzosVar = (zzos) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f4981b, zzosVar.zza());
        objectEncoderContext.add(f4982c, zzosVar.zzb());
        objectEncoderContext.add(f4983d, (Object) null);
        objectEncoderContext.add(f4984e, (Object) null);
    }
}
