package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Gs2 */
/* loaded from: classes3.dex */
public final class Gs2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Gs2 f2218a = new Gs2();

    /* renamed from: b */
    public static final FieldDescriptor f2219b;

    /* renamed from: c */
    public static final FieldDescriptor f2220c;

    /* renamed from: d */
    public static final FieldDescriptor f2221d;

    /* renamed from: e */
    public static final FieldDescriptor f2222e;

    /* renamed from: f */
    public static final FieldDescriptor f2223f;

    /* renamed from: g */
    public static final FieldDescriptor f2224g;

    /* renamed from: h */
    public static final FieldDescriptor f2225h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("pipelineNamespace");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f2219b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("name");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f2220c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("clientLibraryName");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f2221d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("clientLibraryVersion");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f2222e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("minClientLibraryVersion");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f2223f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("maxClientLibraryVersion");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f2224g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("sourceProduct");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f2225h = builder7.withProperty(zzaeVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzln zzlnVar = (zzln) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}