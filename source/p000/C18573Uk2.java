package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzdb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Uk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18573Uk2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18573Uk2 f6428a = new C18573Uk2();

    /* renamed from: b */
    public static final FieldDescriptor f6429b;

    /* renamed from: c */
    public static final FieldDescriptor f6430c;

    /* renamed from: d */
    public static final FieldDescriptor f6431d;

    /* renamed from: e */
    public static final FieldDescriptor f6432e;

    /* renamed from: f */
    public static final FieldDescriptor f6433f;

    /* renamed from: g */
    public static final FieldDescriptor f6434g;

    /* renamed from: h */
    public static final FieldDescriptor f6435h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f6429b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f6430c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f6431d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f6432e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelNamespace");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f6433f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("delegateFilter");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f6434g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("httpResponseCode");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f6435h = builder7.withProperty(zzcqVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdb zzdbVar = (zzdb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
