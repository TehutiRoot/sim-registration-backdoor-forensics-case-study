package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Gx2 */
/* loaded from: classes3.dex */
public final class Gx2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Gx2 f2064a = new Gx2();

    /* renamed from: b */
    public static final FieldDescriptor f2065b;

    /* renamed from: c */
    public static final FieldDescriptor f2066c;

    /* renamed from: d */
    public static final FieldDescriptor f2067d;

    /* renamed from: e */
    public static final FieldDescriptor f2068e;

    /* renamed from: f */
    public static final FieldDescriptor f2069f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f2065b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f2066c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f2067d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f2068e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("httpResponseCode");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f2069f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmq zzmqVar = (zzmq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
