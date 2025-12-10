package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzme;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Jw2 */
/* loaded from: classes3.dex */
public final class Jw2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Jw2 f3170a = new Jw2();

    /* renamed from: b */
    public static final FieldDescriptor f3171b;

    /* renamed from: c */
    public static final FieldDescriptor f3172c;

    /* renamed from: d */
    public static final FieldDescriptor f3173d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3171b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("streamModeSmoothingRatio");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f3172c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("rawSizeMaskEnabled");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f3173d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzme zzmeVar = (zzme) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}