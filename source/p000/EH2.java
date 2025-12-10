package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsl;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: EH2 */
/* loaded from: classes3.dex */
public final class EH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final EH2 f1253a = new EH2();

    /* renamed from: b */
    public static final FieldDescriptor f1254b;

    /* renamed from: c */
    public static final FieldDescriptor f1255c;

    /* renamed from: d */
    public static final FieldDescriptor f1256d;

    /* renamed from: e */
    public static final FieldDescriptor f1257e;

    /* renamed from: f */
    public static final FieldDescriptor f1258f;

    /* renamed from: g */
    public static final FieldDescriptor f1259g;

    /* renamed from: h */
    public static final FieldDescriptor f1260h;

    /* renamed from: i */
    public static final FieldDescriptor f1261i;

    /* renamed from: j */
    public static final FieldDescriptor f1262j;

    /* renamed from: k */
    public static final FieldDescriptor f1263k;

    /* renamed from: l */
    public static final FieldDescriptor f1264l;

    /* renamed from: m */
    public static final FieldDescriptor f1265m;

    /* renamed from: n */
    public static final FieldDescriptor f1266n;

    /* renamed from: o */
    public static final FieldDescriptor f1267o;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID);
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f1254b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f1255c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("firebaseProjectId");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f1256d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("mlSdkVersion");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f1257e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tfliteSchemaVersion");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f1258f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("gcmSenderId");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f1259g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("apiKey");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f1260h = builder7.withProperty(zzfcVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("languages");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        f1261i = builder8.withProperty(zzfcVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("mlSdkInstanceId");
        zzfc zzfcVar9 = new zzfc();
        zzfcVar9.zza(9);
        f1262j = builder9.withProperty(zzfcVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isClearcutClient");
        zzfc zzfcVar10 = new zzfc();
        zzfcVar10.zza(10);
        f1263k = builder10.withProperty(zzfcVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("isStandaloneMlkit");
        zzfc zzfcVar11 = new zzfc();
        zzfcVar11.zza(11);
        f1264l = builder11.withProperty(zzfcVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("isJsonLogging");
        zzfc zzfcVar12 = new zzfc();
        zzfcVar12.zza(12);
        f1265m = builder12.withProperty(zzfcVar12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("buildLevel");
        zzfc zzfcVar13 = new zzfc();
        zzfcVar13.zza(13);
        f1266n = builder13.withProperty(zzfcVar13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("optionalModuleVersion");
        zzfc zzfcVar14 = new zzfc();
        zzfcVar14.zza(14);
        f1267o = builder14.withProperty(zzfcVar14.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsl zzslVar = (zzsl) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f1254b, zzslVar.zzg());
        objectEncoderContext.add(f1255c, zzslVar.zzh());
        objectEncoderContext.add(f1256d, (Object) null);
        objectEncoderContext.add(f1257e, zzslVar.zzj());
        objectEncoderContext.add(f1258f, zzslVar.zzk());
        objectEncoderContext.add(f1259g, (Object) null);
        objectEncoderContext.add(f1260h, (Object) null);
        objectEncoderContext.add(f1261i, zzslVar.zza());
        objectEncoderContext.add(f1262j, zzslVar.zzi());
        objectEncoderContext.add(f1263k, zzslVar.zzb());
        objectEncoderContext.add(f1264l, zzslVar.zzd());
        objectEncoderContext.add(f1265m, zzslVar.zzc());
        objectEncoderContext.add(f1266n, zzslVar.zze());
        objectEncoderContext.add(f1267o, zzslVar.zzf());
    }
}
