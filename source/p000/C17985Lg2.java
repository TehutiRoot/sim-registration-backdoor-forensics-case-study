package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzbp;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Lg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17985Lg2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C17985Lg2 f3522a = new C17985Lg2();

    /* renamed from: b */
    public static final FieldDescriptor f3523b;

    /* renamed from: c */
    public static final FieldDescriptor f3524c;

    /* renamed from: d */
    public static final FieldDescriptor f3525d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f3523b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f3524c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f3525d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzbp zzbpVar = (zzbp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
