package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Rs2 */
/* loaded from: classes3.dex */
public final class Rs2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Rs2 f5663a = new Rs2();

    /* renamed from: b */
    public static final FieldDescriptor f5664b;

    /* renamed from: c */
    public static final FieldDescriptor f5665c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("stageId");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f5664b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("device");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f5665c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlp zzlpVar = (zzlp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}