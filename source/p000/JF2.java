package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrh;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: JF2 */
/* loaded from: classes3.dex */
public final class JF2 implements ObjectEncoder {

    /* renamed from: a */
    public static final JF2 f2741a = new JF2();

    /* renamed from: b */
    public static final FieldDescriptor f2742b;

    /* renamed from: c */
    public static final FieldDescriptor f2743c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f2742b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE);
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f2743c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrh zzrhVar = (zzrh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
