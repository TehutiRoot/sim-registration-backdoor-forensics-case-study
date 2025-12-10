package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmm;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Jx2 */
/* loaded from: classes3.dex */
public final class Jx2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Jx2 f3175a = new Jx2();

    /* renamed from: b */
    public static final FieldDescriptor f3176b;

    /* renamed from: c */
    public static final FieldDescriptor f3177c;

    /* renamed from: d */
    public static final FieldDescriptor f3178d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3176b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f3177c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("recognizerOptions");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f3178d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmm zzmmVar = (zzmm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}