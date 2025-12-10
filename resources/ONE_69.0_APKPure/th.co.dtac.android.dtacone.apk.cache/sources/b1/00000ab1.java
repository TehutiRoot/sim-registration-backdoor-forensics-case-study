package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: LF2 */
/* loaded from: classes3.dex */
public final class LF2 implements ObjectEncoder {

    /* renamed from: a */
    public static final LF2 f3554a = new LF2();

    /* renamed from: b */
    public static final FieldDescriptor f3555b;

    /* renamed from: c */
    public static final FieldDescriptor f3556c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("isFaceMeshEnabled");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f3555b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("useCase");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f3556c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqv zzqvVar = (zzqv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}