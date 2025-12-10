package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkh;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Tq2 */
/* loaded from: classes3.dex */
public final class Tq2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Tq2 f6123a = new Tq2();

    /* renamed from: b */
    public static final FieldDescriptor f6124b;

    /* renamed from: c */
    public static final FieldDescriptor f6125c;

    /* renamed from: d */
    public static final FieldDescriptor f6126d;

    /* renamed from: e */
    public static final FieldDescriptor f6127e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("imageFormat");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f6124b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("originalImageSize");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f6125c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("compressedImageSize");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f6126d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isOdmlImage");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f6127e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkh zzkhVar = (zzkh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f6124b, zzkhVar.zza());
        objectEncoderContext.add(f6125c, zzkhVar.zzb());
        objectEncoderContext.add(f6126d, (Object) null);
        objectEncoderContext.add(f6127e, (Object) null);
    }
}
