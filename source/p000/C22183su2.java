package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: su2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22183su2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22183su2 f79932a = new C22183su2();

    /* renamed from: b */
    public static final FieldDescriptor f79933b;

    /* renamed from: c */
    public static final FieldDescriptor f79934c;

    /* renamed from: d */
    public static final FieldDescriptor f79935d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f79933b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f79934c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f79935d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzgb zzgbVar = (zzgb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
