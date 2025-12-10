package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Xp2 */
/* loaded from: classes3.dex */
public final class Xp2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Xp2 f7672a = new Xp2();

    /* renamed from: b */
    public static final FieldDescriptor f7673b;

    /* renamed from: c */
    public static final FieldDescriptor f7674c;

    /* renamed from: d */
    public static final FieldDescriptor f7675d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f7673b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f7674c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("durationMs");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f7675d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjz zzjzVar = (zzjz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}