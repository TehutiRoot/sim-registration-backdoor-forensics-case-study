package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Vo2 */
/* loaded from: classes3.dex */
public final class Vo2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Vo2 f7097a = new Vo2();

    /* renamed from: b */
    public static final FieldDescriptor f7098b;

    /* renamed from: c */
    public static final FieldDescriptor f7099c;

    /* renamed from: d */
    public static final FieldDescriptor f7100d;

    /* renamed from: e */
    public static final FieldDescriptor f7101e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f7098b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f7099c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f7100d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectedFaces");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f7101e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjp zzjpVar = (zzjp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}