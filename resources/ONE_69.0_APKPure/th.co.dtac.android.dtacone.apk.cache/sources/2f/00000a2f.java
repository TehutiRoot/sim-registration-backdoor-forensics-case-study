package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzic;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Kk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17966Kk2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C17966Kk2 f3388a = new C17966Kk2();

    /* renamed from: b */
    public static final FieldDescriptor f3389b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("useCases");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f3389b = builder.withProperty(zzaeVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzic zzicVar = (zzic) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}