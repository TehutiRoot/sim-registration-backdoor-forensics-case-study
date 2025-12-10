package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Bt2 */
/* loaded from: classes3.dex */
public final class Bt2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Bt2 f577a = new Bt2();

    /* renamed from: b */
    public static final FieldDescriptor f578b;

    /* renamed from: c */
    public static final FieldDescriptor f579c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("language");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f578b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f579c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzld zzldVar = (zzld) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}