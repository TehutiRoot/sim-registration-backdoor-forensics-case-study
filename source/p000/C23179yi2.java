package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: yi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23179yi2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23179yi2 f108828a = new C23179yi2();

    /* renamed from: b */
    public static final FieldDescriptor f108829b;

    /* renamed from: c */
    public static final FieldDescriptor f108830c;

    /* renamed from: d */
    public static final FieldDescriptor f108831d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f108829b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f108830c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f108831d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzho zzhoVar = (zzho) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
