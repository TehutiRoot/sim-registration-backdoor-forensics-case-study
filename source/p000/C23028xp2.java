package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: xp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23028xp2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23028xp2 f108518a = new C23028xp2();

    /* renamed from: b */
    public static final FieldDescriptor f108519b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifiedLanguage");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f108519b = builder.withProperty(zzaeVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkd zzkdVar = (zzkd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
