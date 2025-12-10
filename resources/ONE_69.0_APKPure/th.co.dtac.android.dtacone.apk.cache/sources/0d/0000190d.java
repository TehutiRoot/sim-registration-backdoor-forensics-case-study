package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrj;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: aH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19025aH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19025aH2 f8398a = new C19025aH2();

    /* renamed from: b */
    public static final FieldDescriptor f8399b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifiedLanguages");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f8399b = builder.withProperty(zzfcVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrj zzrjVar = (zzrj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}