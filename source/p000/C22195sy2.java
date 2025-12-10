package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmy;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: sy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22195sy2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22195sy2 f79955a = new C22195sy2();

    /* renamed from: b */
    public static final FieldDescriptor f79956b;

    /* renamed from: c */
    public static final FieldDescriptor f79957c;

    /* renamed from: d */
    public static final FieldDescriptor f79958d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("language");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f79956b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("durationMs");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f79957c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f79958d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmy zzmyVar = (zzmy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
