package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzpw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: cA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19307cA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19307cA2 f39355a = new C19307cA2();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        builder.withProperty(zzayVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpw zzpwVar = (zzpw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
