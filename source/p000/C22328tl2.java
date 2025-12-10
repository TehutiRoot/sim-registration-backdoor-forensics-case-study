package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzdg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: tl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22328tl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22328tl2 f107189a = new C22328tl2();

    /* renamed from: b */
    public static final FieldDescriptor f107190b;

    /* renamed from: c */
    public static final FieldDescriptor f107191c;

    /* renamed from: d */
    public static final FieldDescriptor f107192d;

    /* renamed from: e */
    public static final FieldDescriptor f107193e;

    /* renamed from: f */
    public static final FieldDescriptor f107194f;

    /* renamed from: g */
    public static final FieldDescriptor f107195g;

    /* renamed from: h */
    public static final FieldDescriptor f107196h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f107190b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f107191c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f107192d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f107193e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("options");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f107194f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("detectedBarcodeFormats");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f107195g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("detectedBarcodeValueTypes");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f107196h = builder7.withProperty(zzcqVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdg zzdgVar = (zzdg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
