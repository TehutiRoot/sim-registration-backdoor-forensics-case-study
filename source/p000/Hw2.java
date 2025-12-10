package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoj;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Hw2 */
/* loaded from: classes3.dex */
public final class Hw2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Hw2 f2353a = new Hw2();

    /* renamed from: b */
    public static final FieldDescriptor f2354b;

    /* renamed from: c */
    public static final FieldDescriptor f2355c;

    /* renamed from: d */
    public static final FieldDescriptor f2356d;

    /* renamed from: e */
    public static final FieldDescriptor f2357e;

    /* renamed from: f */
    public static final FieldDescriptor f2358f;

    /* renamed from: g */
    public static final FieldDescriptor f2359g;

    /* renamed from: h */
    public static final FieldDescriptor f2360h;

    /* renamed from: i */
    public static final FieldDescriptor f2361i;

    /* renamed from: j */
    public static final FieldDescriptor f2362j;

    /* renamed from: k */
    public static final FieldDescriptor f2363k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        f2354b = builder.withProperty(zzctVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        f2355c = builder2.withProperty(zzctVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        f2356d = builder3.withProperty(zzctVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("autoManageModelOnBackground");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        f2357e = builder4.withProperty(zzctVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("autoManageModelOnLowMemory");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        f2358f = builder5.withProperty(zzctVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("isNnApiEnabled");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        f2359g = builder6.withProperty(zzctVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("eventsCount");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        f2360h = builder7.withProperty(zzctVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("otherErrors");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        f2361i = builder8.withProperty(zzctVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("remoteConfigValueForAcceleration");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        f2362j = builder9.withProperty(zzctVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isAccelerated");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        f2363k = builder10.withProperty(zzctVar10.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzoj zzojVar = (zzoj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f2354b, zzojVar.zze());
        objectEncoderContext.add(f2355c, zzojVar.zza());
        objectEncoderContext.add(f2356d, zzojVar.zzd());
        objectEncoderContext.add(f2357e, zzojVar.zzb());
        objectEncoderContext.add(f2358f, zzojVar.zzc());
        objectEncoderContext.add(f2359g, (Object) null);
        objectEncoderContext.add(f2360h, (Object) null);
        objectEncoderContext.add(f2361i, (Object) null);
        objectEncoderContext.add(f2362j, (Object) null);
        objectEncoderContext.add(f2363k, (Object) null);
    }
}
