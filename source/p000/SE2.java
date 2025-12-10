package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: SE2 */
/* loaded from: classes3.dex */
public final class SE2 implements ObjectEncoder {

    /* renamed from: a */
    public static final SE2 f5554a = new SE2();

    /* renamed from: b */
    public static final FieldDescriptor f5555b;

    /* renamed from: c */
    public static final FieldDescriptor f5556c;

    /* renamed from: d */
    public static final FieldDescriptor f5557d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        f5555b = builder.withProperty(zzctVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        f5556c = builder2.withProperty(zzctVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("recognizerOptions");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        f5557d = builder3.withProperty(zzctVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrz zzrzVar = (zzrz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f5555b, zzrzVar.zzb());
        objectEncoderContext.add(f5556c, zzrzVar.zza());
        objectEncoderContext.add(f5557d, zzrzVar.zzc());
    }
}
