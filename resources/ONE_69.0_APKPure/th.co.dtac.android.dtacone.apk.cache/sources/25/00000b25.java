package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzij;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ll2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18034Ll2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18034Ll2 f3680a = new C18034Ll2();

    /* renamed from: b */
    public static final FieldDescriptor f3681b;

    /* renamed from: c */
    public static final FieldDescriptor f3682c;

    /* renamed from: d */
    public static final FieldDescriptor f3683d;

    /* renamed from: e */
    public static final FieldDescriptor f3684e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("imageFormat");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f3681b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("originalImageSize");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f3682c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("compressedImageSize");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f3683d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isOdmlImage");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f3684e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzij zzijVar = (zzij) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}