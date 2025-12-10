package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: qq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21827qq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21827qq2 f77081a = new C21827qq2();

    /* renamed from: b */
    public static final FieldDescriptor f77082b;

    /* renamed from: c */
    public static final FieldDescriptor f77083c;

    /* renamed from: d */
    public static final FieldDescriptor f77084d;

    /* renamed from: e */
    public static final FieldDescriptor f77085e;

    /* renamed from: f */
    public static final FieldDescriptor f77086f;

    /* renamed from: g */
    public static final FieldDescriptor f77087g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f77082b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f77083c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f77084d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loadDurationMs");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f77085e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("sessionDurationMs");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f77086f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("sessionTotalInferenceDurationMs");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f77087g = builder6.withProperty(zzaeVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkk zzkkVar = (zzkk) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
