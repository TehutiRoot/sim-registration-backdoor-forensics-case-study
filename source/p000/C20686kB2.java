package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoy;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: kB2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20686kB2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20686kB2 f67823a = new C20686kB2();

    /* renamed from: b */
    public static final FieldDescriptor f67824b;

    /* renamed from: c */
    public static final FieldDescriptor f67825c;

    /* renamed from: d */
    public static final FieldDescriptor f67826d;

    /* renamed from: e */
    public static final FieldDescriptor f67827e;

    /* renamed from: f */
    public static final FieldDescriptor f67828f;

    /* renamed from: g */
    public static final FieldDescriptor f67829g;

    /* renamed from: h */
    public static final FieldDescriptor f67830h;

    /* renamed from: i */
    public static final FieldDescriptor f67831i;

    /* renamed from: j */
    public static final FieldDescriptor f67832j;

    /* renamed from: k */
    public static final FieldDescriptor f67833k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f67824b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f67825c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f67826d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("autoManageModelOnBackground");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f67827e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("autoManageModelOnLowMemory");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f67828f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("isNnApiEnabled");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f67829g = builder6.withProperty(zzfcVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("eventsCount");
        zzfc zzfcVar7 = new zzfc();
        zzfcVar7.zza(7);
        f67830h = builder7.withProperty(zzfcVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("otherErrors");
        zzfc zzfcVar8 = new zzfc();
        zzfcVar8.zza(8);
        f67831i = builder8.withProperty(zzfcVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("remoteConfigValueForAcceleration");
        zzfc zzfcVar9 = new zzfc();
        zzfcVar9.zza(9);
        f67832j = builder9.withProperty(zzfcVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isAccelerated");
        zzfc zzfcVar10 = new zzfc();
        zzfcVar10.zza(10);
        f67833k = builder10.withProperty(zzfcVar10.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzoy zzoyVar = (zzoy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f67824b, zzoyVar.zze());
        objectEncoderContext.add(f67825c, zzoyVar.zza());
        objectEncoderContext.add(f67826d, zzoyVar.zzd());
        objectEncoderContext.add(f67827e, zzoyVar.zzb());
        objectEncoderContext.add(f67828f, zzoyVar.zzc());
        objectEncoderContext.add(f67829g, (Object) null);
        objectEncoderContext.add(f67830h, (Object) null);
        objectEncoderContext.add(f67831i, (Object) null);
        objectEncoderContext.add(f67832j, (Object) null);
        objectEncoderContext.add(f67833k, (Object) null);
    }
}
