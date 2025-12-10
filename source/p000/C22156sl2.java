package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzis;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: sl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22156sl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22156sl2 f79880a = new C22156sl2();

    /* renamed from: b */
    public static final FieldDescriptor f79881b;

    /* renamed from: c */
    public static final FieldDescriptor f79882c;

    /* renamed from: d */
    public static final FieldDescriptor f79883d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f79881b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f79882c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f79883d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzis zzisVar = (zzis) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
