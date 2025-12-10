package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ur2 */
/* loaded from: classes3.dex */
public final class Ur2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ur2 f6469a = new Ur2();

    /* renamed from: b */
    public static final FieldDescriptor f6470b;

    /* renamed from: c */
    public static final FieldDescriptor f6471c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("stageId");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f6470b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("device");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f6471c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlp zzlpVar = (zzlp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
