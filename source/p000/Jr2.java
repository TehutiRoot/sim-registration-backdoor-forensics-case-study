package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Jr2 */
/* loaded from: classes3.dex */
public final class Jr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Jr2 f3043a = new Jr2();

    /* renamed from: b */
    public static final FieldDescriptor f3044b;

    /* renamed from: c */
    public static final FieldDescriptor f3045c;

    /* renamed from: d */
    public static final FieldDescriptor f3046d;

    /* renamed from: e */
    public static final FieldDescriptor f3047e;

    /* renamed from: f */
    public static final FieldDescriptor f3048f;

    /* renamed from: g */
    public static final FieldDescriptor f3049g;

    /* renamed from: h */
    public static final FieldDescriptor f3050h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("pipelineNamespace");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f3044b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("name");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f3045c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("clientLibraryName");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f3046d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("clientLibraryVersion");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f3047e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("minClientLibraryVersion");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f3048f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("maxClientLibraryVersion");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f3049g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("sourceProduct");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f3050h = builder7.withProperty(zzaeVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzln zzlnVar = (zzln) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
