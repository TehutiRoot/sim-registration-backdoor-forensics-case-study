package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: eo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19757eo2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19757eo2 f61600a = new C19757eo2();

    /* renamed from: b */
    public static final FieldDescriptor f61601b;

    /* renamed from: c */
    public static final FieldDescriptor f61602c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("isFaceMeshEnabled");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f61601b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("useCase");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f61602c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjq zzjqVar = (zzjq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
