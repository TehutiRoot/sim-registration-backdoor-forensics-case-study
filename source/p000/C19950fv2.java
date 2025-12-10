package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: fv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19950fv2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19950fv2 f61984a = new C19950fv2();

    /* renamed from: b */
    public static final FieldDescriptor f61985b;

    /* renamed from: c */
    public static final FieldDescriptor f61986c;

    /* renamed from: d */
    public static final FieldDescriptor f61987d;

    /* renamed from: e */
    public static final FieldDescriptor f61988e;

    /* renamed from: f */
    public static final FieldDescriptor f61989f;

    /* renamed from: g */
    public static final FieldDescriptor f61990g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f61985b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f61986c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f61987d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("detectorOptions");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f61988e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("contourDetectedFaces");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f61989f = builder5.withProperty(zzfcVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("nonContourDetectedFaces");
        zzfc zzfcVar6 = new zzfc();
        zzfcVar6.zza(6);
        f61990g = builder6.withProperty(zzfcVar6.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzgg zzggVar = (zzgg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
