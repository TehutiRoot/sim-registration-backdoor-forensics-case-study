package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Hs2 */
/* loaded from: classes3.dex */
public final class Hs2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Hs2 f2498a = new Hs2();

    /* renamed from: b */
    public static final FieldDescriptor f2499b;

    /* renamed from: c */
    public static final FieldDescriptor f2500c;

    /* renamed from: d */
    public static final FieldDescriptor f2501d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifyLanguageConfidenceThreshold");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f2499b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("identifyAllLanguagesConfidenceThreshold");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f2500c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("confidenceThreshold");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f2501d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkp zzkpVar = (zzkp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}