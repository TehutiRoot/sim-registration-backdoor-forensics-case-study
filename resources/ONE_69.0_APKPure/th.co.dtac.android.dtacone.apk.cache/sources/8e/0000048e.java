package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: En2 */
/* loaded from: classes3.dex */
public final class En2 implements ObjectEncoder {

    /* renamed from: a */
    public static final En2 f1452a = new En2();

    /* renamed from: b */
    public static final FieldDescriptor f1453b;

    /* renamed from: c */
    public static final FieldDescriptor f1454c;

    /* renamed from: d */
    public static final FieldDescriptor f1455d;

    /* renamed from: e */
    public static final FieldDescriptor f1456e;

    /* renamed from: f */
    public static final FieldDescriptor f1457f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f1453b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f1454c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("detectedBarcodeFormats");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f1455d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectedBarcodeValueTypes");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f1456e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f1457f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjg zzjgVar = (zzjg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}