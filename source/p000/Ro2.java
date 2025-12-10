package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Ro2 */
/* loaded from: classes3.dex */
public final class Ro2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Ro2 f5434a = new Ro2();

    /* renamed from: b */
    public static final FieldDescriptor f5435b;

    /* renamed from: c */
    public static final FieldDescriptor f5436c;

    /* renamed from: d */
    public static final FieldDescriptor f5437d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxLabels");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f5435b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("confidenceThreshold");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f5436c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("customLocalModelOptions");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f5437d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjx zzjxVar = (zzjx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
