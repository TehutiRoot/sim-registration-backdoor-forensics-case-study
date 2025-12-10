package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzap;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Je2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17851Je2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C17851Je2 f2864a = new C17851Je2();

    /* renamed from: b */
    public static final FieldDescriptor f2865b;

    /* renamed from: c */
    public static final FieldDescriptor f2866c;

    /* renamed from: d */
    public static final FieldDescriptor f2867d;

    /* renamed from: e */
    public static final FieldDescriptor f2868e;

    /* renamed from: f */
    public static final FieldDescriptor f2869f;

    /* renamed from: g */
    public static final FieldDescriptor f2870g;

    /* renamed from: h */
    public static final FieldDescriptor f2871h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f2865b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f2866c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f2867d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f2868e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelNamespace");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f2869f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("delegateFilter");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f2870g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("httpResponseCode");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f2871h = builder7.withProperty(zzaeVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzap zzapVar = (zzap) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
