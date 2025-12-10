package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zziz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Zn2 */
/* loaded from: classes3.dex */
public final class Zn2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Zn2 f8138a = new Zn2();

    /* renamed from: b */
    public static final FieldDescriptor f8139b;

    /* renamed from: c */
    public static final FieldDescriptor f8140c;

    /* renamed from: d */
    public static final FieldDescriptor f8141d;

    /* renamed from: e */
    public static final FieldDescriptor f8142e;

    /* renamed from: f */
    public static final FieldDescriptor f8143f;

    /* renamed from: g */
    public static final FieldDescriptor f8144g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("cameraSource");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f8139b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f8140c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("requestedPreviewHeight");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f8141d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("requestedPreviewWidth");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f8142e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("actualPreviewHeight");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f8143f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("actualPreviewWidth");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f8144g = builder6.withProperty(zzcqVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zziz zzizVar = (zziz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
