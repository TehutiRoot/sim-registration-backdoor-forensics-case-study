package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: As2 */
/* loaded from: classes3.dex */
public final class As2 implements ObjectEncoder {

    /* renamed from: a */
    public static final As2 f244a = new As2();

    /* renamed from: b */
    public static final FieldDescriptor f245b;

    /* renamed from: c */
    public static final FieldDescriptor f246c;

    /* renamed from: d */
    public static final FieldDescriptor f247d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f245b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("stages");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f246c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("runMiniBenchmark");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f247d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlm zzlmVar = (zzlm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}