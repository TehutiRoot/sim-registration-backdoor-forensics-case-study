package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsr;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: WI2 */
/* loaded from: classes3.dex */
public final class WI2 implements ObjectEncoder {

    /* renamed from: a */
    public static final WI2 f7252a = new WI2();

    /* renamed from: b */
    public static final FieldDescriptor f7253b;

    /* renamed from: c */
    public static final FieldDescriptor f7254c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("sourceLanguage");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7253b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("targetLanguage");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7254c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsr zzsrVar = (zzsr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}