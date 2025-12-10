package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpa;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: AB2 */
/* loaded from: classes3.dex */
public final class AB2 implements ObjectEncoder {

    /* renamed from: a */
    public static final AB2 f38a = new AB2();

    /* renamed from: b */
    public static final FieldDescriptor f39b;

    /* renamed from: c */
    public static final FieldDescriptor f40c;

    /* renamed from: d */
    public static final FieldDescriptor f41d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelType");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f39b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isDownloaded");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f40c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelName");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f41d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpa zzpaVar = (zzpa) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
