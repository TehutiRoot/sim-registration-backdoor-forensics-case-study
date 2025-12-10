package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzmq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Dy2 */
/* loaded from: classes3.dex */
public final class Dy2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Dy2 f1204a = new Dy2();

    /* renamed from: b */
    public static final FieldDescriptor f1205b;

    /* renamed from: c */
    public static final FieldDescriptor f1206c;

    /* renamed from: d */
    public static final FieldDescriptor f1207d;

    /* renamed from: e */
    public static final FieldDescriptor f1208e;

    /* renamed from: f */
    public static final FieldDescriptor f1209f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f1205b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f1206c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f1207d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f1208e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("httpResponseCode");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f1209f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmq zzmqVar = (zzmq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}