package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkl;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: gr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20110gr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20110gr2 f62323a = new C20110gr2();

    /* renamed from: b */
    public static final FieldDescriptor f62324b;

    /* renamed from: c */
    public static final FieldDescriptor f62325c;

    /* renamed from: d */
    public static final FieldDescriptor f62326d;

    /* renamed from: e */
    public static final FieldDescriptor f62327e;

    /* renamed from: f */
    public static final FieldDescriptor f62328f;

    /* renamed from: g */
    public static final FieldDescriptor f62329g;

    /* renamed from: h */
    public static final FieldDescriptor f62330h;

    /* renamed from: i */
    public static final FieldDescriptor f62331i;

    /* renamed from: j */
    public static final FieldDescriptor f62332j;

    /* renamed from: k */
    public static final FieldDescriptor f62333k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f62324b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f62325c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f62326d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("autoManageModelOnBackground");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f62327e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("autoManageModelOnLowMemory");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f62328f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("isNnApiEnabled");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f62329g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("eventsCount");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f62330h = builder7.withProperty(zzcqVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("otherErrors");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        f62331i = builder8.withProperty(zzcqVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("remoteConfigValueForAcceleration");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        f62332j = builder9.withProperty(zzcqVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isAccelerated");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        f62333k = builder10.withProperty(zzcqVar10.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkl zzklVar = (zzkl) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f62324b, zzklVar.zze());
        objectEncoderContext.add(f62325c, zzklVar.zza());
        objectEncoderContext.add(f62326d, zzklVar.zzd());
        objectEncoderContext.add(f62327e, zzklVar.zzb());
        objectEncoderContext.add(f62328f, zzklVar.zzc());
        objectEncoderContext.add(f62329g, (Object) null);
        objectEncoderContext.add(f62330h, (Object) null);
        objectEncoderContext.add(f62331i, (Object) null);
        objectEncoderContext.add(f62332j, (Object) null);
        objectEncoderContext.add(f62333k, (Object) null);
    }
}
