package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzap;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Gf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17691Gf2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C17691Gf2 f2034a = new C17691Gf2();

    /* renamed from: b */
    public static final FieldDescriptor f2035b;

    /* renamed from: c */
    public static final FieldDescriptor f2036c;

    /* renamed from: d */
    public static final FieldDescriptor f2037d;

    /* renamed from: e */
    public static final FieldDescriptor f2038e;

    /* renamed from: f */
    public static final FieldDescriptor f2039f;

    /* renamed from: g */
    public static final FieldDescriptor f2040g;

    /* renamed from: h */
    public static final FieldDescriptor f2041h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f2035b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f2036c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f2037d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f2038e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelNamespace");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f2039f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("delegateFilter");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f2040g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("httpResponseCode");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f2041h = builder7.withProperty(zzaeVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzap zzapVar = (zzap) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}