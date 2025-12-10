package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzro;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Pm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18297Pm2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18297Pm2 f4885a = new C18297Pm2();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("format");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        builder.withProperty(zzayVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzro zzroVar = (zzro) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}