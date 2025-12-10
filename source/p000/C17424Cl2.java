package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zziu;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Cl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17424Cl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C17424Cl2 f817a = new C17424Cl2();

    /* renamed from: b */
    public static final FieldDescriptor f818b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("api");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f818b = builder.withProperty(zzaeVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zziu zziuVar = (zziu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
