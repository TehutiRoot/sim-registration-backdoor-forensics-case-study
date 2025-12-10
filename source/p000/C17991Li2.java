package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzhr;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Li2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17991Li2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C17991Li2 f3539a = new C17991Li2();

    /* renamed from: b */
    public static final FieldDescriptor f3540b;

    /* renamed from: c */
    public static final FieldDescriptor f3541c;

    /* renamed from: d */
    public static final FieldDescriptor f3542d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f3540b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f3541c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f3542d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhr zzhrVar = (zzhr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
