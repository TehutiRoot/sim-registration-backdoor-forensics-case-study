package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsr;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ZH2 */
/* loaded from: classes3.dex */
public final class ZH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final ZH2 f8008a = new ZH2();

    /* renamed from: b */
    public static final FieldDescriptor f8009b;

    /* renamed from: c */
    public static final FieldDescriptor f8010c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("sourceLanguage");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f8009b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("targetLanguage");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f8010c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsr zzsrVar = (zzsr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
