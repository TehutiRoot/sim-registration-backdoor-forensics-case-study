package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzdd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Yk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18829Yk2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18829Yk2 f7843a = new C18829Yk2();

    /* renamed from: b */
    public static final FieldDescriptor f7844b;

    /* renamed from: c */
    public static final FieldDescriptor f7845c;

    /* renamed from: d */
    public static final FieldDescriptor f7846d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f7844b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f7845c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f7846d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdd zzddVar = (zzdd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
