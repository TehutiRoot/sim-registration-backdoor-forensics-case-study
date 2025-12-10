package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzec;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: tn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22334tn2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22334tn2 f107208a = new C22334tn2();

    /* renamed from: b */
    public static final FieldDescriptor f107209b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f107209b = builder.withProperty(zzcqVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzec zzecVar = (zzec) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
