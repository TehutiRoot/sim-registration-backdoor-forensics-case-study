package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Oz2 */
/* loaded from: classes3.dex */
public final class Oz2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Oz2 f4638a = new Oz2();

    /* renamed from: b */
    public static final FieldDescriptor f4639b;

    /* renamed from: c */
    public static final FieldDescriptor f4640c;

    /* renamed from: d */
    public static final FieldDescriptor f4641d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("numSamples");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f4639b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f4640c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("metricResults");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f4641d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznk zznkVar = (zznk) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}