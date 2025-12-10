package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: ay2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19099ay2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19099ay2 f38890a = new C19099ay2();

    /* renamed from: b */
    public static final FieldDescriptor f38891b;

    /* renamed from: c */
    public static final FieldDescriptor f38892c;

    /* renamed from: d */
    public static final FieldDescriptor f38893d;

    /* renamed from: e */
    public static final FieldDescriptor f38894e;

    /* renamed from: f */
    public static final FieldDescriptor f38895f;

    /* renamed from: g */
    public static final FieldDescriptor f38896g;

    /* renamed from: h */
    public static final FieldDescriptor f38897h;

    /* renamed from: i */
    public static final FieldDescriptor f38898i;

    /* renamed from: j */
    public static final FieldDescriptor f38899j;

    /* renamed from: k */
    public static final FieldDescriptor f38900k;

    /* renamed from: l */
    public static final FieldDescriptor f38901l;

    /* renamed from: m */
    public static final FieldDescriptor f38902m;

    /* renamed from: n */
    public static final FieldDescriptor f38903n;

    /* renamed from: o */
    public static final FieldDescriptor f38904o;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID);
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f38891b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f38892c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("firebaseProjectId");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f38893d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("mlSdkVersion");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f38894e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tfliteSchemaVersion");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f38895f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("gcmSenderId");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f38896g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("apiKey");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f38897h = builder7.withProperty(zzcqVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("languages");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        f38898i = builder8.withProperty(zzcqVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("mlSdkInstanceId");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        f38899j = builder9.withProperty(zzcqVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isClearcutClient");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        f38900k = builder10.withProperty(zzcqVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("isStandaloneMlkit");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(11);
        f38901l = builder11.withProperty(zzcqVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("isJsonLogging");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(12);
        f38902m = builder12.withProperty(zzcqVar12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("buildLevel");
        zzcq zzcqVar13 = new zzcq();
        zzcqVar13.zza(13);
        f38903n = builder13.withProperty(zzcqVar13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("optionalModuleVersion");
        zzcq zzcqVar14 = new zzcq();
        zzcqVar14.zza(14);
        f38904o = builder14.withProperty(zzcqVar14.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmv zzmvVar = (zzmv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f38891b, zzmvVar.zzg());
        objectEncoderContext.add(f38892c, zzmvVar.zzh());
        objectEncoderContext.add(f38893d, (Object) null);
        objectEncoderContext.add(f38894e, zzmvVar.zzj());
        objectEncoderContext.add(f38895f, zzmvVar.zzk());
        objectEncoderContext.add(f38896g, (Object) null);
        objectEncoderContext.add(f38897h, (Object) null);
        objectEncoderContext.add(f38898i, zzmvVar.zza());
        objectEncoderContext.add(f38899j, zzmvVar.zzi());
        objectEncoderContext.add(f38900k, zzmvVar.zzb());
        objectEncoderContext.add(f38901l, zzmvVar.zzd());
        objectEncoderContext.add(f38902m, zzmvVar.zzc());
        objectEncoderContext.add(f38903n, zzmvVar.zze());
        objectEncoderContext.add(f38904o, zzmvVar.zzf());
    }
}
