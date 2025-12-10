package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Qo2 */
/* loaded from: classes3.dex */
public final class Qo2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Qo2 f5322a = new Qo2();

    /* renamed from: b */
    public static final FieldDescriptor f5323b;

    /* renamed from: c */
    public static final FieldDescriptor f5324c;

    /* renamed from: d */
    public static final FieldDescriptor f5325d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f5323b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f5324c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("durationMs");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f5325d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjo zzjoVar = (zzjo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}