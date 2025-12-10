package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzic;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Nj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18122Nj2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18122Nj2 f4177a = new C18122Nj2();

    /* renamed from: b */
    public static final FieldDescriptor f4178b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("useCases");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f4178b = builder.withProperty(zzaeVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzic zzicVar = (zzic) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
