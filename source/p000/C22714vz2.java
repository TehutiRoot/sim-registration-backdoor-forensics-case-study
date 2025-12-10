package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzny;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: vz2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22714vz2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22714vz2 f107868a = new C22714vz2();

    /* renamed from: b */
    public static final FieldDescriptor f107869b;

    /* renamed from: c */
    public static final FieldDescriptor f107870c;

    /* renamed from: d */
    public static final FieldDescriptor f107871d;

    /* renamed from: e */
    public static final FieldDescriptor f107872e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("supportedFormats");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f107869b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("durationMs");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f107870c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f107871d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("allowManualInput");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f107872e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzny zznyVar = (zzny) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
