package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsl;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: BI2 */
/* loaded from: classes3.dex */
public final class BI2 implements ObjectEncoder {

    /* renamed from: a */
    public static final BI2 f359a = new BI2();

    /* renamed from: b */
    public static final FieldDescriptor f360b;

    /* renamed from: c */
    public static final FieldDescriptor f361c;

    /* renamed from: d */
    public static final FieldDescriptor f362d;

    /* renamed from: e */
    public static final FieldDescriptor f363e;

    /* renamed from: f */
    public static final FieldDescriptor f364f;

    /* renamed from: g */
    public static final FieldDescriptor f365g;

    /* renamed from: h */
    public static final FieldDescriptor f366h;

    /* renamed from: i */
    public static final FieldDescriptor f367i;

    /* renamed from: j */
    public static final FieldDescriptor f368j;

    /* renamed from: k */
    public static final FieldDescriptor f369k;

    /* renamed from: l */
    public static final FieldDescriptor f370l;

    /* renamed from: m */
    public static final FieldDescriptor f371m;

    /* renamed from: n */
    public static final FieldDescriptor f372n;

    /* renamed from: o */
    public static final FieldDescriptor f373o;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID);
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f360b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f361c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("firebaseProjectId");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f362d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("mlSdkVersion");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f363e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tfliteSchemaVersion");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f364f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("gcmSenderId");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f365g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("apiKey");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f366h = builder7.withProperty(zzfcVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("languages");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        f367i = builder8.withProperty(zzfcVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("mlSdkInstanceId");
        zzfc zzfcVar9 = new zzfc();
        zzfcVar9.zza(9);
        f368j = builder9.withProperty(zzfcVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isClearcutClient");
        zzfc zzfcVar10 = new zzfc();
        zzfcVar10.zza(10);
        f369k = builder10.withProperty(zzfcVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("isStandaloneMlkit");
        zzfc zzfcVar11 = new zzfc();
        zzfcVar11.zza(11);
        f370l = builder11.withProperty(zzfcVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("isJsonLogging");
        zzfc zzfcVar12 = new zzfc();
        zzfcVar12.zza(12);
        f371m = builder12.withProperty(zzfcVar12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("buildLevel");
        zzfc zzfcVar13 = new zzfc();
        zzfcVar13.zza(13);
        f372n = builder13.withProperty(zzfcVar13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("optionalModuleVersion");
        zzfc zzfcVar14 = new zzfc();
        zzfcVar14.zza(14);
        f373o = builder14.withProperty(zzfcVar14.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsl zzslVar = (zzsl) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f360b, zzslVar.zzg());
        objectEncoderContext.add(f361c, zzslVar.zzh());
        objectEncoderContext.add(f362d, (Object) null);
        objectEncoderContext.add(f363e, zzslVar.zzj());
        objectEncoderContext.add(f364f, zzslVar.zzk());
        objectEncoderContext.add(f365g, (Object) null);
        objectEncoderContext.add(f366h, (Object) null);
        objectEncoderContext.add(f367i, zzslVar.zza());
        objectEncoderContext.add(f368j, zzslVar.zzi());
        objectEncoderContext.add(f369k, zzslVar.zzb());
        objectEncoderContext.add(f370l, zzslVar.zzd());
        objectEncoderContext.add(f371m, zzslVar.zzc());
        objectEncoderContext.add(f372n, zzslVar.zze());
        objectEncoderContext.add(f373o, zzslVar.zzf());
    }
}