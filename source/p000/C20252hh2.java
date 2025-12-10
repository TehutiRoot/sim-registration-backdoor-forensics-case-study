package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: hh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20252hh2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20252hh2 f62561a = new C20252hh2();

    /* renamed from: b */
    public static final FieldDescriptor f62562b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("format");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f62562b = builder.withProperty(zzaeVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlt zzltVar = (zzlt) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
