package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: QC2 */
/* loaded from: classes3.dex */
public final class QC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final QC2 f5151a = new QC2();

    /* renamed from: b */
    public static final FieldDescriptor f5152b;

    /* renamed from: c */
    public static final FieldDescriptor f5153c;

    /* renamed from: d */
    public static final FieldDescriptor f5154d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifyLanguageConfidenceThreshold");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f5152b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("identifyAllLanguagesConfidenceThreshold");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f5153c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("confidenceThreshold");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f5154d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpc zzpcVar = (zzpc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}