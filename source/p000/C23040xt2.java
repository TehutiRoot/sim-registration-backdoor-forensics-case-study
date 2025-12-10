package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzlg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: xt2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23040xt2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23040xt2 f108562a = new C23040xt2();

    /* renamed from: b */
    public static final FieldDescriptor f108563b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f108563b = builder.withProperty(zzcqVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlg zzlgVar = (zzlg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
