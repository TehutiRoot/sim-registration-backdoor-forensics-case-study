package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzil;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Xk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18765Xk2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18765Xk2 f7570a = new C18765Xk2();

    /* renamed from: b */
    public static final FieldDescriptor f7571b;

    /* renamed from: c */
    public static final FieldDescriptor f7572c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f7571b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f7572c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzil zzilVar = (zzil) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
