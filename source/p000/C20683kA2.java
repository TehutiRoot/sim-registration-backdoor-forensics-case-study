package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzps;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: kA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20683kA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20683kA2 f67819a = new C20683kA2();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        builder.withProperty(zzctVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzps zzpsVar = (zzps) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
