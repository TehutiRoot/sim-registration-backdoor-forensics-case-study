package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: xG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22937xG2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22937xG2 f108297a = new C22937xG2();

    /* renamed from: b */
    public static final FieldDescriptor f108298b;

    /* renamed from: c */
    public static final FieldDescriptor f108299c;

    /* renamed from: d */
    public static final FieldDescriptor f108300d;

    /* renamed from: e */
    public static final FieldDescriptor f108301e;

    /* renamed from: f */
    public static final FieldDescriptor f108302f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f108298b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f108299c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("totalInitializationMs");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f108300d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loggingInitializationMs");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f108301e = builder4.withProperty(zzfcVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("otherErrors");
        zzfc zzfcVar5 = new zzfc();
        zzfcVar5.zza(5);
        f108302f = builder5.withProperty(zzfcVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzro zzroVar = (zzro) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
