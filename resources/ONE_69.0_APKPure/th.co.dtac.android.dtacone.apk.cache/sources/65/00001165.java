package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzso;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: SI2 */
/* loaded from: classes3.dex */
public final class SI2 implements ObjectEncoder {

    /* renamed from: a */
    public static final SI2 f5795a = new SI2();

    /* renamed from: b */
    public static final FieldDescriptor f5796b;

    /* renamed from: c */
    public static final FieldDescriptor f5797c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("language");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f5796b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f5797c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzso zzsoVar = (zzso) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}