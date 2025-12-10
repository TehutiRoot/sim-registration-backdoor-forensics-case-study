package p000;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: oH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21392oH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21392oH2 f72650a = new C21392oH2();

    /* renamed from: b */
    public static final FieldDescriptor f72651b;

    /* renamed from: c */
    public static final FieldDescriptor f72652c;

    /* renamed from: d */
    public static final FieldDescriptor f72653d;

    /* renamed from: e */
    public static final FieldDescriptor f72654e;

    /* renamed from: f */
    public static final FieldDescriptor f72655f;

    /* renamed from: g */
    public static final FieldDescriptor f72656g;

    /* renamed from: h */
    public static final FieldDescriptor f72657h;

    /* renamed from: i */
    public static final FieldDescriptor f72658i;

    /* renamed from: j */
    public static final FieldDescriptor f72659j;

    /* renamed from: k */
    public static final FieldDescriptor f72660k;

    /* renamed from: l */
    public static final FieldDescriptor f72661l;

    /* renamed from: m */
    public static final FieldDescriptor f72662m;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("deviceInfo");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f72651b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("nnapiInfo");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f72652c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("gpuInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f72653d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("pipelineIdentifier");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f72654e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("acceptedConfigurations");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f72655f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("action");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f72656g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f72657h = builder7.withProperty(zzfcVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("customErrors");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        f72658i = builder8.withProperty(zzfcVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("benchmarkStatus");
        zzfc zzfcVar9 = new zzfc();
        zzfcVar9.zza(9);
        f72659j = builder9.withProperty(zzfcVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("validationTestResult");
        zzfc zzfcVar10 = new zzfc();
        zzfcVar10.zza(10);
        f72660k = builder10.withProperty(zzfcVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("timestampUs");
        zzfc zzfcVar11 = new zzfc();
        zzfcVar11.zza(11);
        f72661l = builder11.withProperty(zzfcVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("elapsedUs");
        zzfc zzfcVar12 = new zzfc();
        zzfcVar12.zza(12);
        f72662m = builder12.withProperty(zzfcVar12.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsz zzszVar = (zzsz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
