package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzla;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: qs2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21833qs2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21833qs2 f77096a = new C21833qs2();

    /* renamed from: b */
    public static final FieldDescriptor f77097b;

    /* renamed from: c */
    public static final FieldDescriptor f77098c;

    /* renamed from: d */
    public static final FieldDescriptor f77099d;

    /* renamed from: e */
    public static final FieldDescriptor f77100e;

    /* renamed from: f */
    public static final FieldDescriptor f77101f;

    /* renamed from: g */
    public static final FieldDescriptor f77102g;

    /* renamed from: h */
    public static final FieldDescriptor f77103h;

    /* renamed from: i */
    public static final FieldDescriptor f77104i;

    /* renamed from: j */
    public static final FieldDescriptor f77105j;

    /* renamed from: k */
    public static final FieldDescriptor f77106k;

    /* renamed from: l */
    public static final FieldDescriptor f77107l;

    /* renamed from: m */
    public static final FieldDescriptor f77108m;

    /* renamed from: n */
    public static final FieldDescriptor f77109n;

    /* renamed from: o */
    public static final FieldDescriptor f77110o;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID);
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f77097b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f77098c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("firebaseProjectId");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f77099d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("mlSdkVersion");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f77100e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tfliteSchemaVersion");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f77101f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("gcmSenderId");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f77102g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("apiKey");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f77103h = builder7.withProperty(zzaeVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("languages");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        f77104i = builder8.withProperty(zzaeVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("mlSdkInstanceId");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        f77105j = builder9.withProperty(zzaeVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isClearcutClient");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        f77106k = builder10.withProperty(zzaeVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("isStandaloneMlkit");
        zzae zzaeVar11 = new zzae();
        zzaeVar11.zza(11);
        f77107l = builder11.withProperty(zzaeVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("isJsonLogging");
        zzae zzaeVar12 = new zzae();
        zzaeVar12.zza(12);
        f77108m = builder12.withProperty(zzaeVar12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("buildLevel");
        zzae zzaeVar13 = new zzae();
        zzaeVar13.zza(13);
        f77109n = builder13.withProperty(zzaeVar13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("optionalModuleVersion");
        zzae zzaeVar14 = new zzae();
        zzaeVar14.zza(14);
        f77110o = builder14.withProperty(zzaeVar14.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzla zzlaVar = (zzla) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f77097b, zzlaVar.zzg());
        objectEncoderContext.add(f77098c, zzlaVar.zzh());
        objectEncoderContext.add(f77099d, (Object) null);
        objectEncoderContext.add(f77100e, zzlaVar.zzj());
        objectEncoderContext.add(f77101f, zzlaVar.zzk());
        objectEncoderContext.add(f77102g, (Object) null);
        objectEncoderContext.add(f77103h, (Object) null);
        objectEncoderContext.add(f77104i, zzlaVar.zza());
        objectEncoderContext.add(f77105j, zzlaVar.zzi());
        objectEncoderContext.add(f77106k, zzlaVar.zzb());
        objectEncoderContext.add(f77107l, zzlaVar.zzd());
        objectEncoderContext.add(f77108m, zzlaVar.zzc());
        objectEncoderContext.add(f77109n, zzlaVar.zze());
        objectEncoderContext.add(f77110o, zzlaVar.zzf());
    }
}
