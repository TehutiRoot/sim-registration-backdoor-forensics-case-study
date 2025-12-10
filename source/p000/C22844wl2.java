package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzit;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: wl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22844wl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22844wl2 f108118a = new C22844wl2();

    /* renamed from: b */
    public static final FieldDescriptor f108119b;

    /* renamed from: c */
    public static final FieldDescriptor f108120c;

    /* renamed from: d */
    public static final FieldDescriptor f108121d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifyLanguageConfidenceThreshold");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f108119b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("identifyAllLanguagesConfidenceThreshold");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f108120c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("confidenceThreshold");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f108121d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzit zzitVar = (zzit) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
