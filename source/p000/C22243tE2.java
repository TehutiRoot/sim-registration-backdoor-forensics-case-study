package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: tE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22243tE2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22243tE2 f80050a = new C22243tE2();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        builder.withProperty(zzctVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrn zzrnVar = (zzrn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
