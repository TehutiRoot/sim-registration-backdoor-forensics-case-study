package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: gF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20010gF2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20010gF2 f62098a = new C20010gF2();

    /* renamed from: b */
    public static final FieldDescriptor f62099b;

    /* renamed from: c */
    public static final FieldDescriptor f62100c;

    /* renamed from: d */
    public static final FieldDescriptor f62101d;

    /* renamed from: e */
    public static final FieldDescriptor f62102e;

    /* renamed from: f */
    public static final FieldDescriptor f62103f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f62099b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCodes");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f62100c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("totalInitializationMs");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f62101d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loggingInitializationMs");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f62102e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("otherErrors");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f62103f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrb zzrbVar = (zzrb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
