package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzdb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Rl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18424Rl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18424Rl2 f5623a = new C18424Rl2();

    /* renamed from: b */
    public static final FieldDescriptor f5624b;

    /* renamed from: c */
    public static final FieldDescriptor f5625c;

    /* renamed from: d */
    public static final FieldDescriptor f5626d;

    /* renamed from: e */
    public static final FieldDescriptor f5627e;

    /* renamed from: f */
    public static final FieldDescriptor f5628f;

    /* renamed from: g */
    public static final FieldDescriptor f5629g;

    /* renamed from: h */
    public static final FieldDescriptor f5630h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f5624b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f5625c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f5626d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f5627e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelNamespace");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f5628f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("delegateFilter");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f5629g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("httpResponseCode");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f5630h = builder7.withProperty(zzcqVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdb zzdbVar = (zzdb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}