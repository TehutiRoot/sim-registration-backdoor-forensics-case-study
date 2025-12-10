package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzps;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: MC2 */
/* loaded from: classes3.dex */
public final class MC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final MC2 f3701a = new MC2();

    /* renamed from: b */
    public static final FieldDescriptor f3702b;

    /* renamed from: c */
    public static final FieldDescriptor f3703c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("eventType");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f3702b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f3703c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzps zzpsVar = (zzps) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
