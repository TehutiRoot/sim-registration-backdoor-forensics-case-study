package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzdj;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: xl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23016xl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23016xl2 f108493a = new C23016xl2();

    /* renamed from: b */
    public static final FieldDescriptor f108494b;

    /* renamed from: c */
    public static final FieldDescriptor f108495c;

    /* renamed from: d */
    public static final FieldDescriptor f108496d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f108494b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f108495c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f108496d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdj zzdjVar = (zzdj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
