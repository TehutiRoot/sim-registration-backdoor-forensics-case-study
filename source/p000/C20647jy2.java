package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzph;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: jy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20647jy2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20647jy2 f67770a = new C20647jy2();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("optionsType");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        builder.withProperty(zzayVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzph zzphVar = (zzph) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
