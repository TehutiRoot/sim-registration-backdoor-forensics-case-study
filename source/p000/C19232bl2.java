package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzim;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: bl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19232bl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19232bl2 f39205a = new C19232bl2();

    /* renamed from: b */
    public static final FieldDescriptor f39206b;

    /* renamed from: c */
    public static final FieldDescriptor f39207c;

    /* renamed from: d */
    public static final FieldDescriptor f39208d;

    /* renamed from: e */
    public static final FieldDescriptor f39209e;

    /* renamed from: f */
    public static final FieldDescriptor f39210f;

    /* renamed from: g */
    public static final FieldDescriptor f39211g;

    /* renamed from: h */
    public static final FieldDescriptor f39212h;

    /* renamed from: i */
    public static final FieldDescriptor f39213i;

    /* renamed from: j */
    public static final FieldDescriptor f39214j;

    /* renamed from: k */
    public static final FieldDescriptor f39215k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f39206b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f39207c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f39208d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("autoManageModelOnBackground");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f39209e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("autoManageModelOnLowMemory");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f39210f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("isNnApiEnabled");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f39211g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("eventsCount");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f39212h = builder7.withProperty(zzaeVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("otherErrors");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        f39213i = builder8.withProperty(zzaeVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("remoteConfigValueForAcceleration");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        f39214j = builder9.withProperty(zzaeVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("isAccelerated");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        f39215k = builder10.withProperty(zzaeVar10.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzim zzimVar = (zzim) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
