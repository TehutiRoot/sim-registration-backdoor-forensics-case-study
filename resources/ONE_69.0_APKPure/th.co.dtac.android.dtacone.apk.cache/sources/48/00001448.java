package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrx;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: VH2 */
/* loaded from: classes3.dex */
public final class VH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final VH2 f6875a = new VH2();

    /* renamed from: b */
    public static final FieldDescriptor f6876b;

    /* renamed from: c */
    public static final FieldDescriptor f6877c;

    /* renamed from: d */
    public static final FieldDescriptor f6878d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("languageOption");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(3);
        f6876b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isUsingLegacyApi");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(4);
        f6877c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(5);
        f6878d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrx zzrxVar = (zzrx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}