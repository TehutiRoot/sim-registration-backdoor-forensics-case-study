package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: yo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23197yo2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23197yo2 f108866a = new C23197yo2();

    /* renamed from: b */
    public static final FieldDescriptor f108867b;

    /* renamed from: c */
    public static final FieldDescriptor f108868c;

    /* renamed from: d */
    public static final FieldDescriptor f108869d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f108867b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f108868c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f108869d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjd zzjdVar = (zzjd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
