package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlh;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: zj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23354zj2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23354zj2 f109165a = new C23354zj2();

    /* renamed from: b */
    public static final FieldDescriptor f109166b;

    /* renamed from: c */
    public static final FieldDescriptor f109167c;

    /* renamed from: d */
    public static final FieldDescriptor f109168d;

    /* renamed from: e */
    public static final FieldDescriptor f109169e;

    /* renamed from: f */
    public static final FieldDescriptor f109170f;

    /* renamed from: g */
    public static final FieldDescriptor f109171g;

    /* renamed from: h */
    public static final FieldDescriptor f109172h;

    /* renamed from: i */
    public static final FieldDescriptor f109173i;

    /* renamed from: j */
    public static final FieldDescriptor f109174j;

    /* renamed from: k */
    public static final FieldDescriptor f109175k;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f109166b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("osBuild");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f109167c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("brand");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f109168d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("device");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f109169e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hardware");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f109170f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("manufacturer");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f109171g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("model");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f109172h = builder7.withProperty(zzaeVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("product");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        f109173i = builder8.withProperty(zzaeVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("soc");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        f109174j = builder9.withProperty(zzaeVar9.zzb()).build();
        FieldDescriptor.Builder builder10 = FieldDescriptor.builder("socMetaBuildId");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        f109175k = builder10.withProperty(zzaeVar10.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlh zzlhVar = (zzlh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
