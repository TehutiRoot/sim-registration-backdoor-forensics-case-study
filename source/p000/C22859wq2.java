package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzjw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: wq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22859wq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22859wq2 f108158a = new C22859wq2();

    /* renamed from: b */
    public static final FieldDescriptor f108159b;

    /* renamed from: c */
    public static final FieldDescriptor f108160c;

    /* renamed from: d */
    public static final FieldDescriptor f108161d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f108159b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f108160c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f108161d = builder3.withProperty(zzcqVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjw zzjwVar = (zzjw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
