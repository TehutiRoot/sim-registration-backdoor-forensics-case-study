package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzlz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: hv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20294hv2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20294hv2 f62654a = new C20294hv2();

    /* renamed from: b */
    public static final FieldDescriptor f62655b;

    /* renamed from: c */
    public static final FieldDescriptor f62656c;

    /* renamed from: d */
    public static final FieldDescriptor f62657d;

    /* renamed from: e */
    public static final FieldDescriptor f62658e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f62655b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f62656c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f62657d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("objectInfos");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f62658e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlz zzlzVar = (zzlz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
