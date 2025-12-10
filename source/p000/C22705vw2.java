package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: vw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22705vw2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22705vw2 f107852a = new C22705vw2();

    /* renamed from: b */
    public static final FieldDescriptor f107853b;

    /* renamed from: c */
    public static final FieldDescriptor f107854c;

    /* renamed from: d */
    public static final FieldDescriptor f107855d;

    /* renamed from: e */
    public static final FieldDescriptor f107856e;

    /* renamed from: f */
    public static final FieldDescriptor f107857f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f107853b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f107854c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f107855d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f107856e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("detectorOptions");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f107857f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzgq zzgqVar = (zzgq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
