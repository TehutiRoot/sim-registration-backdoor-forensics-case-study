package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzst;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: CG2 */
/* loaded from: classes3.dex */
public final class CG2 implements ObjectEncoder {

    /* renamed from: a */
    public static final CG2 f667a = new CG2();

    /* renamed from: b */
    public static final FieldDescriptor f668b;

    /* renamed from: c */
    public static final FieldDescriptor f669c;

    /* renamed from: d */
    public static final FieldDescriptor f670d;

    /* renamed from: e */
    public static final FieldDescriptor f671e;

    /* renamed from: f */
    public static final FieldDescriptor f672f;

    /* renamed from: g */
    public static final FieldDescriptor f673g;

    /* renamed from: h */
    public static final FieldDescriptor f674h;

    /* renamed from: i */
    public static final FieldDescriptor f675i;

    /* renamed from: j */
    public static final FieldDescriptor f676j;

    /* renamed from: k */
    public static final FieldDescriptor f677k;

    /* renamed from: l */
    public static final FieldDescriptor f678l;

    /* renamed from: m */
    public static final FieldDescriptor f679m;

    /* renamed from: n */
    public static final FieldDescriptor f680n;

    /* renamed from: o */
    public static final FieldDescriptor f681o;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID);
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        f668b = builder.withProperty(zzctVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        f669c = builder2.withProperty(zzctVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("firebaseProjectId");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        f670d = builder3.withProperty(zzctVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("mlSdkVersion");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        f671e = builder4.withProperty(zzctVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("tfliteSchemaVersion");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        f672f = builder5.withProperty(zzctVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("gcmSenderId");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        f673g = builder6.withProperty(zzctVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("apiKey");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        f674h = builder7.withProperty(zzctVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("languages");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        f675i = builder8.withProperty(zzctVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("mlSdkInstanceId");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        f676j = builder9.withProperty(zzctVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isClearcutClient");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        f677k = builder10.withProperty(zzctVar10.zzb()).build();
        FieldDescriptor.Builder builder11 = FieldDescriptor.builder("isStandaloneMlkit");
        zzct zzctVar11 = new zzct();
        zzctVar11.zza(11);
        f678l = builder11.withProperty(zzctVar11.zzb()).build();
        FieldDescriptor.Builder builder12 = FieldDescriptor.builder("isJsonLogging");
        zzct zzctVar12 = new zzct();
        zzctVar12.zza(12);
        f679m = builder12.withProperty(zzctVar12.zzb()).build();
        FieldDescriptor.Builder builder13 = FieldDescriptor.builder("buildLevel");
        zzct zzctVar13 = new zzct();
        zzctVar13.zza(13);
        f680n = builder13.withProperty(zzctVar13.zzb()).build();
        FieldDescriptor.Builder builder14 = FieldDescriptor.builder("optionalModuleVersion");
        zzct zzctVar14 = new zzct();
        zzctVar14.zza(14);
        f681o = builder14.withProperty(zzctVar14.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzst zzstVar = (zzst) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f668b, zzstVar.zzg());
        objectEncoderContext.add(f669c, zzstVar.zzh());
        objectEncoderContext.add(f670d, (Object) null);
        objectEncoderContext.add(f671e, zzstVar.zzj());
        objectEncoderContext.add(f672f, zzstVar.zzk());
        objectEncoderContext.add(f673g, (Object) null);
        objectEncoderContext.add(f674h, (Object) null);
        objectEncoderContext.add(f675i, zzstVar.zza());
        objectEncoderContext.add(f676j, zzstVar.zzi());
        objectEncoderContext.add(f677k, zzstVar.zzb());
        objectEncoderContext.add(f678l, zzstVar.zzd());
        objectEncoderContext.add(f679m, zzstVar.zzc());
        objectEncoderContext.add(f680n, zzstVar.zze());
        objectEncoderContext.add(f681o, zzstVar.zzf());
    }
}
