package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzta;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: pH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21564pH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21564pH2 f76548a = new C21564pH2();

    /* renamed from: b */
    public static final FieldDescriptor f76549b;

    /* renamed from: c */
    public static final FieldDescriptor f76550c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("stageId");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f76549b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("device");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f76550c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzta zztaVar = (zzta) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
