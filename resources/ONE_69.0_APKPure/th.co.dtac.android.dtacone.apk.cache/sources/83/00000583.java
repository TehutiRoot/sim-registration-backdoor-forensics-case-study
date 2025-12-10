package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzee;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Fo2 */
/* loaded from: classes3.dex */
public final class Fo2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Fo2 f1778a = new Fo2();

    /* renamed from: b */
    public static final FieldDescriptor f1779b;

    /* renamed from: c */
    public static final FieldDescriptor f1780c;

    /* renamed from: d */
    public static final FieldDescriptor f1781d;

    /* renamed from: e */
    public static final FieldDescriptor f1782e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("remoteModelOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f1779b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("localModelOptions");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f1780c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCodes");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f1781d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("modelInitializationMs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f1782e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzee zzeeVar = (zzee) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}