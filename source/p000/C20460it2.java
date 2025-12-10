package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzle;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: it2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20460it2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20460it2 f67090a = new C20460it2();

    /* renamed from: b */
    public static final FieldDescriptor f67091b;

    /* renamed from: c */
    public static final FieldDescriptor f67092c;

    /* renamed from: d */
    public static final FieldDescriptor f67093d;

    /* renamed from: e */
    public static final FieldDescriptor f67094e;

    /* renamed from: f */
    public static final FieldDescriptor f67095f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f67091b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f67092c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("detectedBarcodeFormats");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f67093d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectedBarcodeValueTypes");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f67094e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f67095f = builder5.withProperty(zzcqVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzle zzleVar = (zzle) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
