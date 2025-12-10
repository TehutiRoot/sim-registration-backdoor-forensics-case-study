package p000;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznh;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ux2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22536ux2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22536ux2 f107523a = new C22536ux2();

    /* renamed from: b */
    public static final FieldDescriptor f107524b;

    /* renamed from: c */
    public static final FieldDescriptor f107525c;

    /* renamed from: d */
    public static final FieldDescriptor f107526d;

    /* renamed from: e */
    public static final FieldDescriptor f107527e;

    /* renamed from: f */
    public static final FieldDescriptor f107528f;

    /* renamed from: g */
    public static final FieldDescriptor f107529g;

    /* renamed from: h */
    public static final FieldDescriptor f107530h;

    /* renamed from: i */
    public static final FieldDescriptor f107531i;

    /* renamed from: j */
    public static final FieldDescriptor f107532j;

    /* renamed from: k */
    public static final FieldDescriptor f107533k;

    /* renamed from: l */
    public static final FieldDescriptor f107534l;

    /* renamed from: m */
    public static final FieldDescriptor f107535m;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("deviceInfo");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f107524b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("nnapiInfo");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f107525c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("gpuInfo");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f107526d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("pipelineIdentifier");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f107527e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("acceptedConfigurations");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f107528f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("action");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f107529g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f107530h = builder7.withProperty(zzcqVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("customErrors");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        f107531i = builder8.withProperty(zzcqVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("benchmarkStatus");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        f107532j = builder9.withProperty(zzcqVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("validationTestResult");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        f107533k = builder10.withProperty(zzcqVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("timestampUs");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(11);
        f107534l = builder11.withProperty(zzcqVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("elapsedUs");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(12);
        f107535m = builder12.withProperty(zzcqVar12.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznh zznhVar = (zznh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
