package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzma;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ov2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21498ov2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21498ov2 f76424a = new C21498ov2();

    /* renamed from: b */
    public static final FieldDescriptor f76425b;

    /* renamed from: c */
    public static final FieldDescriptor f76426c;

    /* renamed from: d */
    public static final FieldDescriptor f76427d;

    /* renamed from: e */
    public static final FieldDescriptor f76428e;

    /* renamed from: f */
    public static final FieldDescriptor f76429f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f76425b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f76426c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("totalInitializationMs");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f76427d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loggingInitializationMs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f76428e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("otherErrors");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f76429f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzma zzmaVar = (zzma) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
