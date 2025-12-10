package p000;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ls2 */
/* loaded from: classes3.dex */
public final class Ls2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ls2 f3724a = new Ls2();

    /* renamed from: b */
    public static final FieldDescriptor f3725b;

    /* renamed from: c */
    public static final FieldDescriptor f3726c;

    /* renamed from: d */
    public static final FieldDescriptor f3727d;

    /* renamed from: e */
    public static final FieldDescriptor f3728e;

    /* renamed from: f */
    public static final FieldDescriptor f3729f;

    /* renamed from: g */
    public static final FieldDescriptor f3730g;

    /* renamed from: h */
    public static final FieldDescriptor f3731h;

    /* renamed from: i */
    public static final FieldDescriptor f3732i;

    /* renamed from: j */
    public static final FieldDescriptor f3733j;

    /* renamed from: k */
    public static final FieldDescriptor f3734k;

    /* renamed from: l */
    public static final FieldDescriptor f3735l;

    /* renamed from: m */
    public static final FieldDescriptor f3736m;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("deviceInfo");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f3725b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("nnapiInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f3726c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("gpuInfo");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f3727d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("pipelineIdentifier");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f3728e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("acceptedConfigurations");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f3729f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("action");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f3730g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f3731h = builder7.withProperty(zzaeVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("customErrors");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        f3732i = builder8.withProperty(zzaeVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("benchmarkStatus");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        f3733j = builder9.withProperty(zzaeVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("validationTestResult");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        f3734k = builder10.withProperty(zzaeVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("timestampUs");
        zzae zzaeVar11 = new zzae();
        zzaeVar11.zza(11);
        f3735l = builder11.withProperty(zzaeVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("elapsedUs");
        zzae zzaeVar12 = new zzae();
        zzaeVar12.zza(12);
        f3736m = builder12.withProperty(zzaeVar12.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlo zzloVar = (zzlo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}