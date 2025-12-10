package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzod;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Zw2 */
/* loaded from: classes3.dex */
public final class Zw2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Zw2 f8306a = new Zw2();

    /* renamed from: b */
    public static final FieldDescriptor f8307b;

    /* renamed from: c */
    public static final FieldDescriptor f8308c;

    /* renamed from: d */
    public static final FieldDescriptor f8309d;

    /* renamed from: e */
    public static final FieldDescriptor f8310e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("imageFormat");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        f8307b = builder.withProperty(zzctVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("originalImageSize");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        f8308c = builder2.withProperty(zzctVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("compressedImageSize");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        f8309d = builder3.withProperty(zzctVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isOdmlImage");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        f8310e = builder4.withProperty(zzctVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzod zzodVar = (zzod) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f8307b, zzodVar.zza());
        objectEncoderContext.add(f8308c, zzodVar.zzb());
        objectEncoderContext.add(f8309d, (Object) null);
        objectEncoderContext.add(f8310e, (Object) null);
    }
}