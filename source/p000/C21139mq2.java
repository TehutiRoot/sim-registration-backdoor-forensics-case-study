package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: mq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21139mq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21139mq2 f72057a = new C21139mq2();

    /* renamed from: b */
    public static final FieldDescriptor f72058b;

    /* renamed from: c */
    public static final FieldDescriptor f72059c;

    /* renamed from: d */
    public static final FieldDescriptor f72060d;

    /* renamed from: e */
    public static final FieldDescriptor f72061e;

    /* renamed from: f */
    public static final FieldDescriptor f72062f;

    /* renamed from: g */
    public static final FieldDescriptor f72063g;

    /* renamed from: h */
    public static final FieldDescriptor f72064h;

    /* renamed from: i */
    public static final FieldDescriptor f72065i;

    /* renamed from: j */
    public static final FieldDescriptor f72066j;

    /* renamed from: k */
    public static final FieldDescriptor f72067k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f72058b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("osBuild");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f72059c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("brand");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f72060d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("device");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f72061e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hardware");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f72062f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("manufacturer");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f72063g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("model");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f72064h = builder7.withProperty(zzcqVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("product");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        f72065i = builder8.withProperty(zzcqVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("soc");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        f72066j = builder9.withProperty(zzcqVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("socMetaBuildId");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        f72067k = builder10.withProperty(zzcqVar10.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzna zznaVar = (zzna) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
