package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzom;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: tA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22231tA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22231tA2 f80026a = new C22231tA2();

    /* renamed from: b */
    public static final FieldDescriptor f80027b;

    /* renamed from: c */
    public static final FieldDescriptor f80028c;

    /* renamed from: d */
    public static final FieldDescriptor f80029d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f80027b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f80028c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f80029d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzom zzomVar = (zzom) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
