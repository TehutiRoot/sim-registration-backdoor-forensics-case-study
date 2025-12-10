package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzij;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ok2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18189Ok2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18189Ok2 f4481a = new C18189Ok2();

    /* renamed from: b */
    public static final FieldDescriptor f4482b;

    /* renamed from: c */
    public static final FieldDescriptor f4483c;

    /* renamed from: d */
    public static final FieldDescriptor f4484d;

    /* renamed from: e */
    public static final FieldDescriptor f4485e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("imageFormat");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f4482b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("originalImageSize");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f4483c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("compressedImageSize");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f4484d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isOdmlImage");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f4485e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzij zzijVar = (zzij) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
