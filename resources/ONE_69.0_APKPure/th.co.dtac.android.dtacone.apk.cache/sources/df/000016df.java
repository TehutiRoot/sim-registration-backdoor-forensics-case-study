package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: Xy2 */
/* loaded from: classes3.dex */
public final class Xy2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Xy2 f7735a = new Xy2();

    /* renamed from: b */
    public static final FieldDescriptor f7736b;

    /* renamed from: c */
    public static final FieldDescriptor f7737c;

    /* renamed from: d */
    public static final FieldDescriptor f7738d;

    /* renamed from: e */
    public static final FieldDescriptor f7739e;

    /* renamed from: f */
    public static final FieldDescriptor f7740f;

    /* renamed from: g */
    public static final FieldDescriptor f7741g;

    /* renamed from: h */
    public static final FieldDescriptor f7742h;

    /* renamed from: i */
    public static final FieldDescriptor f7743i;

    /* renamed from: j */
    public static final FieldDescriptor f7744j;

    /* renamed from: k */
    public static final FieldDescriptor f7745k;

    /* renamed from: l */
    public static final FieldDescriptor f7746l;

    /* renamed from: m */
    public static final FieldDescriptor f7747m;

    /* renamed from: n */
    public static final FieldDescriptor f7748n;

    /* renamed from: o */
    public static final FieldDescriptor f7749o;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID);
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f7736b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f7737c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("firebaseProjectId");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f7738d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("mlSdkVersion");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f7739e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tfliteSchemaVersion");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f7740f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("gcmSenderId");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f7741g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("apiKey");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f7742h = builder7.withProperty(zzcqVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("languages");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        f7743i = builder8.withProperty(zzcqVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("mlSdkInstanceId");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        f7744j = builder9.withProperty(zzcqVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isClearcutClient");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        f7745k = builder10.withProperty(zzcqVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("isStandaloneMlkit");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(11);
        f7746l = builder11.withProperty(zzcqVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("isJsonLogging");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(12);
        f7747m = builder12.withProperty(zzcqVar12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("buildLevel");
        zzcq zzcqVar13 = new zzcq();
        zzcqVar13.zza(13);
        f7748n = builder13.withProperty(zzcqVar13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("optionalModuleVersion");
        zzcq zzcqVar14 = new zzcq();
        zzcqVar14.zza(14);
        f7749o = builder14.withProperty(zzcqVar14.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmv zzmvVar = (zzmv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f7736b, zzmvVar.zzg());
        objectEncoderContext.add(f7737c, zzmvVar.zzh());
        objectEncoderContext.add(f7738d, (Object) null);
        objectEncoderContext.add(f7739e, zzmvVar.zzj());
        objectEncoderContext.add(f7740f, zzmvVar.zzk());
        objectEncoderContext.add(f7741g, (Object) null);
        objectEncoderContext.add(f7742h, (Object) null);
        objectEncoderContext.add(f7743i, zzmvVar.zza());
        objectEncoderContext.add(f7744j, zzmvVar.zzi());
        objectEncoderContext.add(f7745k, zzmvVar.zzb());
        objectEncoderContext.add(f7746l, zzmvVar.zzd());
        objectEncoderContext.add(f7747m, zzmvVar.zzc());
        objectEncoderContext.add(f7748n, zzmvVar.zze());
        objectEncoderContext.add(f7749o, zzmvVar.zzf());
    }
}