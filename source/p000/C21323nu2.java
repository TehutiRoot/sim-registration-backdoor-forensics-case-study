package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzlr;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: nu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21323nu2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21323nu2 f72505a = new C21323nu2();

    /* renamed from: b */
    public static final FieldDescriptor f72506b;

    /* renamed from: c */
    public static final FieldDescriptor f72507c;

    /* renamed from: d */
    public static final FieldDescriptor f72508d;

    /* renamed from: e */
    public static final FieldDescriptor f72509e;

    /* renamed from: f */
    public static final FieldDescriptor f72510f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f72506b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCodes");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f72507c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("totalInitializationMs");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f72508d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loggingInitializationMs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f72509e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("otherErrors");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f72510f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlr zzlrVar = (zzlr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
