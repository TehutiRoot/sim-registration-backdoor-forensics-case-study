package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: NA2 */
/* loaded from: classes3.dex */
public final class NA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final NA2 f4084a = new NA2();

    /* renamed from: b */
    public static final FieldDescriptor f4085b;

    /* renamed from: c */
    public static final FieldDescriptor f4086c;

    /* renamed from: d */
    public static final FieldDescriptor f4087d;

    /* renamed from: e */
    public static final FieldDescriptor f4088e;

    /* renamed from: f */
    public static final FieldDescriptor f4089f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f4085b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f4086c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputsFormats");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f4087d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputFormats");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f4088e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelInitializationMs");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f4089f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzoc zzocVar = (zzoc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}