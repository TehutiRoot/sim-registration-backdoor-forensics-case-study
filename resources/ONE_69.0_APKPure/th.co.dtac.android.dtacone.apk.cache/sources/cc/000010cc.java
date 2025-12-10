package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzay;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Rg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18409Rg2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18409Rg2 f5594a = new C18409Rg2();

    /* renamed from: b */
    public static final FieldDescriptor f5595b;

    /* renamed from: c */
    public static final FieldDescriptor f5596c;

    /* renamed from: d */
    public static final FieldDescriptor f5597d;

    /* renamed from: e */
    public static final FieldDescriptor f5598e;

    /* renamed from: f */
    public static final FieldDescriptor f5599f;

    /* renamed from: g */
    public static final FieldDescriptor f5600g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f5595b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f5596c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f5597d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f5598e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("contourDetectedFaces");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f5599f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("nonContourDetectedFaces");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f5600g = builder6.withProperty(zzaeVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzay zzayVar = (zzay) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}