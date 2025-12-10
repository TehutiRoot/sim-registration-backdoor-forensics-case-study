package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ox2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21504ox2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21504ox2 f76437a = new C21504ox2();

    /* renamed from: b */
    public static final FieldDescriptor f76438b;

    /* renamed from: c */
    public static final FieldDescriptor f76439c;

    /* renamed from: d */
    public static final FieldDescriptor f76440d;

    /* renamed from: e */
    public static final FieldDescriptor f76441e;

    /* renamed from: f */
    public static final FieldDescriptor f76442f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f76438b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f76439c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("modelInitializationMs");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f76440d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("confidenceThreshold");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f76441e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f76442f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzgz zzgzVar = (zzgz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
