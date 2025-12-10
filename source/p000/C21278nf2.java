package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzau;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: nf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21278nf2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21278nf2 f72404a = new C21278nf2();

    /* renamed from: b */
    public static final FieldDescriptor f72405b;

    /* renamed from: c */
    public static final FieldDescriptor f72406c;

    /* renamed from: d */
    public static final FieldDescriptor f72407d;

    /* renamed from: e */
    public static final FieldDescriptor f72408e;

    /* renamed from: f */
    public static final FieldDescriptor f72409f;

    /* renamed from: g */
    public static final FieldDescriptor f72410g;

    /* renamed from: h */
    public static final FieldDescriptor f72411h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f72405b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f72406c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f72407d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f72408e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("options");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f72409f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("detectedBarcodeFormats");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f72410g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("detectedBarcodeValueTypes");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f72411h = builder7.withProperty(zzaeVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzau zzauVar = (zzau) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
