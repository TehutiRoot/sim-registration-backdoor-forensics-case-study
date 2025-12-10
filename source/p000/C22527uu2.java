package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzls;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: uu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22527uu2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22527uu2 f107496a = new C22527uu2();

    /* renamed from: b */
    public static final FieldDescriptor f107497b;

    /* renamed from: c */
    public static final FieldDescriptor f107498c;

    /* renamed from: d */
    public static final FieldDescriptor f107499d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxLabels");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f107497b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("confidenceThreshold");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f107498c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("customLocalModelOptions");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f107499d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzls zzlsVar = (zzls) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
