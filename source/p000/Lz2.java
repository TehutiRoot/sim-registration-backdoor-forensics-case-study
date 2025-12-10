package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzob;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Lz2 */
/* loaded from: classes3.dex */
public final class Lz2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Lz2 f3652a = new Lz2();

    /* renamed from: b */
    public static final FieldDescriptor f3653b;

    /* renamed from: c */
    public static final FieldDescriptor f3654c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("type");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f3653b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("dims");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f3654c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzob zzobVar = (zzob) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
