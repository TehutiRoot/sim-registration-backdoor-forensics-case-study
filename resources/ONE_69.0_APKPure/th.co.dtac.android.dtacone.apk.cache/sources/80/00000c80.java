package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzos;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: NB2 */
/* loaded from: classes3.dex */
public final class NB2 implements ObjectEncoder {

    /* renamed from: a */
    public static final NB2 f4092a = new NB2();

    /* renamed from: b */
    public static final FieldDescriptor f4093b;

    /* renamed from: c */
    public static final FieldDescriptor f4094c;

    /* renamed from: d */
    public static final FieldDescriptor f4095d;

    /* renamed from: e */
    public static final FieldDescriptor f4096e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("imageFormat");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f4093b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("originalImageSize");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f4094c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("compressedImageSize");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f4095d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isOdmlImage");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f4096e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzos zzosVar = (zzos) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f4093b, zzosVar.zza());
        objectEncoderContext.add(f4094c, zzosVar.zzb());
        objectEncoderContext.add(f4095d, (Object) null);
        objectEncoderContext.add(f4096e, (Object) null);
    }
}