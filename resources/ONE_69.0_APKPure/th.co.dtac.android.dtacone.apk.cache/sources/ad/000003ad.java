package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Dr2 */
/* loaded from: classes3.dex */
public final class Dr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Dr2 f1134a = new Dr2();

    /* renamed from: b */
    public static final FieldDescriptor f1135b;

    /* renamed from: c */
    public static final FieldDescriptor f1136c;

    /* renamed from: d */
    public static final FieldDescriptor f1137d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f1135b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("streamModeSmoothingRatio");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f1136c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("rawSizeMaskEnabled");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f1137d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkn zzknVar = (zzkn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}