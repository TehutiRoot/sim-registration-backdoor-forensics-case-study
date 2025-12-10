package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzkh;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Qr2 */
/* loaded from: classes3.dex */
public final class Qr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Qr2 f5333a = new Qr2();

    /* renamed from: b */
    public static final FieldDescriptor f5334b;

    /* renamed from: c */
    public static final FieldDescriptor f5335c;

    /* renamed from: d */
    public static final FieldDescriptor f5336d;

    /* renamed from: e */
    public static final FieldDescriptor f5337e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("imageFormat");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f5334b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("originalImageSize");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f5335c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("compressedImageSize");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f5336d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isOdmlImage");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f5337e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkh zzkhVar = (zzkh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f5334b, zzkhVar.zza());
        objectEncoderContext.add(f5335c, zzkhVar.zzb());
        objectEncoderContext.add(f5336d, (Object) null);
        objectEncoderContext.add(f5337e, (Object) null);
    }
}