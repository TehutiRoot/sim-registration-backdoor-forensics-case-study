package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzhz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: wj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22838wj2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22838wj2 f108106a = new C22838wj2();

    /* renamed from: b */
    public static final FieldDescriptor f108107b;

    /* renamed from: c */
    public static final FieldDescriptor f108108c;

    /* renamed from: d */
    public static final FieldDescriptor f108109d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelType");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f108107b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isSuccessful");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f108108c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelName");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f108109d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhz zzhzVar = (zzhz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
