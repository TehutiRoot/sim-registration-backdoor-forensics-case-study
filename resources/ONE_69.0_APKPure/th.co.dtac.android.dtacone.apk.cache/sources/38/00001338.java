package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoe;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: UA2 */
/* loaded from: classes3.dex */
public final class UA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final UA2 f6560a = new UA2();

    /* renamed from: b */
    public static final FieldDescriptor f6561b;

    /* renamed from: c */
    public static final FieldDescriptor f6562c;

    /* renamed from: d */
    public static final FieldDescriptor f6563d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelType");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f6561b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isSuccessful");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f6562c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelName");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f6563d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzoe zzoeVar = (zzoe) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}