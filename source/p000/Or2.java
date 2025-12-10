package p000;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Or2 */
/* loaded from: classes3.dex */
public final class Or2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Or2 f4521a = new Or2();

    /* renamed from: b */
    public static final FieldDescriptor f4522b;

    /* renamed from: c */
    public static final FieldDescriptor f4523c;

    /* renamed from: d */
    public static final FieldDescriptor f4524d;

    /* renamed from: e */
    public static final FieldDescriptor f4525e;

    /* renamed from: f */
    public static final FieldDescriptor f4526f;

    /* renamed from: g */
    public static final FieldDescriptor f4527g;

    /* renamed from: h */
    public static final FieldDescriptor f4528h;

    /* renamed from: i */
    public static final FieldDescriptor f4529i;

    /* renamed from: j */
    public static final FieldDescriptor f4530j;

    /* renamed from: k */
    public static final FieldDescriptor f4531k;

    /* renamed from: l */
    public static final FieldDescriptor f4532l;

    /* renamed from: m */
    public static final FieldDescriptor f4533m;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("deviceInfo");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f4522b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("nnapiInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f4523c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("gpuInfo");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f4524d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("pipelineIdentifier");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f4525e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("acceptedConfigurations");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f4526f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("action");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f4527g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f4528h = builder7.withProperty(zzaeVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("customErrors");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        f4529i = builder8.withProperty(zzaeVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("benchmarkStatus");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        f4530j = builder9.withProperty(zzaeVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("validationTestResult");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        f4531k = builder10.withProperty(zzaeVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("timestampUs");
        zzae zzaeVar11 = new zzae();
        zzaeVar11.zza(11);
        f4532l = builder11.withProperty(zzaeVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("elapsedUs");
        zzae zzaeVar12 = new zzae();
        zzaeVar12.zza(12);
        f4533m = builder12.withProperty(zzaeVar12.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlo zzloVar = (zzlo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
