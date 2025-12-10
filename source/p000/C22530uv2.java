package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: uv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22530uv2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22530uv2 f107507a = new C22530uv2();

    /* renamed from: b */
    public static final FieldDescriptor f107508b;

    /* renamed from: c */
    public static final FieldDescriptor f107509c;

    /* renamed from: d */
    public static final FieldDescriptor f107510d;

    /* renamed from: e */
    public static final FieldDescriptor f107511e;

    /* renamed from: f */
    public static final FieldDescriptor f107512f;

    /* renamed from: g */
    public static final FieldDescriptor f107513g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f107508b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f107509c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f107510d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loadDurationMs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f107511e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("sessionDurationMs");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f107512f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("sessionTotalInferenceDurationMs");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f107513g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmb zzmbVar = (zzmb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
