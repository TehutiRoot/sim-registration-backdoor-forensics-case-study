package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzng;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: px2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21676px2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21676px2 f76822a = new C21676px2();

    /* renamed from: b */
    public static final FieldDescriptor f76823b;

    /* renamed from: c */
    public static final FieldDescriptor f76824c;

    /* renamed from: d */
    public static final FieldDescriptor f76825d;

    /* renamed from: e */
    public static final FieldDescriptor f76826e;

    /* renamed from: f */
    public static final FieldDescriptor f76827f;

    /* renamed from: g */
    public static final FieldDescriptor f76828g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("pipelineNamespace");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f76823b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("name");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f76824c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("clientLibraryName");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f76825d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("clientLibraryVersion");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f76826e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("minClientLibraryVersion");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f76827f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("maxClientLibraryVersion");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f76828g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzng zzngVar = (zzng) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
