package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzob;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: IA2 */
/* loaded from: classes3.dex */
public final class IA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final IA2 f2598a = new IA2();

    /* renamed from: b */
    public static final FieldDescriptor f2599b;

    /* renamed from: c */
    public static final FieldDescriptor f2600c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("type");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f2599b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("dims");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f2600c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzob zzobVar = (zzob) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}