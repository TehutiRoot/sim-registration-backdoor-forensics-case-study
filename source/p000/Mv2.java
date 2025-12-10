package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzme;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Mv2 */
/* loaded from: classes3.dex */
public final class Mv2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Mv2 f3950a = new Mv2();

    /* renamed from: b */
    public static final FieldDescriptor f3951b;

    /* renamed from: c */
    public static final FieldDescriptor f3952c;

    /* renamed from: d */
    public static final FieldDescriptor f3953d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorMode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3951b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("streamModeSmoothingRatio");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f3952c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("rawSizeMaskEnabled");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f3953d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzme zzmeVar = (zzme) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
