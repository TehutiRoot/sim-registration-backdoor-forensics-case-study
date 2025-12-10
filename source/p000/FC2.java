package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpr;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: FC2 */
/* loaded from: classes3.dex */
public final class FC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final FC2 f1533a = new FC2();

    /* renamed from: b */
    public static final FieldDescriptor f1534b;

    /* renamed from: c */
    public static final FieldDescriptor f1535c;

    /* renamed from: d */
    public static final FieldDescriptor f1536d;

    /* renamed from: e */
    public static final FieldDescriptor f1537e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelInfo");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f1534b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("initialDownloadConditions");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f1535c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("updateDownloadConditions");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f1536d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isModelUpdateEnabled");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f1537e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpr zzprVar = (zzpr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
