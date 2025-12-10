package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzqv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: vC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22581vC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22581vC2 f107609a = new C22581vC2();

    /* renamed from: b */
    public static final FieldDescriptor f107610b;

    /* renamed from: c */
    public static final FieldDescriptor f107611c;

    /* renamed from: d */
    public static final FieldDescriptor f107612d;

    /* renamed from: e */
    public static final FieldDescriptor f107613e;

    /* renamed from: f */
    public static final FieldDescriptor f107614f;

    /* renamed from: g */
    public static final FieldDescriptor f107615g;

    /* renamed from: h */
    public static final FieldDescriptor f107616h;

    /* renamed from: i */
    public static final FieldDescriptor f107617i;

    /* renamed from: j */
    public static final FieldDescriptor f107618j;

    /* renamed from: k */
    public static final FieldDescriptor f107619k;

    /* renamed from: l */
    public static final FieldDescriptor f107620l;

    /* renamed from: m */
    public static final FieldDescriptor f107621m;

    /* renamed from: n */
    public static final FieldDescriptor f107622n;

    /* renamed from: o */
    public static final FieldDescriptor f107623o;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID);
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        f107610b = builder.withProperty(zzayVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        f107611c = builder2.withProperty(zzayVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("firebaseProjectId");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        f107612d = builder3.withProperty(zzayVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("mlSdkVersion");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        f107613e = builder4.withProperty(zzayVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tfliteSchemaVersion");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        f107614f = builder5.withProperty(zzayVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("gcmSenderId");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        f107615g = builder6.withProperty(zzayVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("apiKey");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        f107616h = builder7.withProperty(zzayVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("languages");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        f107617i = builder8.withProperty(zzayVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("mlSdkInstanceId");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        f107618j = builder9.withProperty(zzayVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isClearcutClient");
        zzay zzayVar10 = new zzay();
        zzayVar10.zza(10);
        f107619k = builder10.withProperty(zzayVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("isStandaloneMlkit");
        zzay zzayVar11 = new zzay();
        zzayVar11.zza(11);
        f107620l = builder11.withProperty(zzayVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("isJsonLogging");
        zzay zzayVar12 = new zzay();
        zzayVar12.zza(12);
        f107621m = builder12.withProperty(zzayVar12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("buildLevel");
        zzay zzayVar13 = new zzay();
        zzayVar13.zza(13);
        f107622n = builder13.withProperty(zzayVar13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("optionalModuleVersion");
        zzay zzayVar14 = new zzay();
        zzayVar14.zza(14);
        f107623o = builder14.withProperty(zzayVar14.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqv zzqvVar = (zzqv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f107610b, zzqvVar.zzg());
        objectEncoderContext.add(f107611c, zzqvVar.zzh());
        objectEncoderContext.add(f107612d, (Object) null);
        objectEncoderContext.add(f107613e, zzqvVar.zzj());
        objectEncoderContext.add(f107614f, zzqvVar.zzk());
        objectEncoderContext.add(f107615g, (Object) null);
        objectEncoderContext.add(f107616h, (Object) null);
        objectEncoderContext.add(f107617i, zzqvVar.zza());
        objectEncoderContext.add(f107618j, zzqvVar.zzi());
        objectEncoderContext.add(f107619k, zzqvVar.zzb());
        objectEncoderContext.add(f107620l, zzqvVar.zzd());
        objectEncoderContext.add(f107621m, zzqvVar.zzc());
        objectEncoderContext.add(f107622n, zzqvVar.zze());
        objectEncoderContext.add(f107623o, zzqvVar.zzf());
    }
}
