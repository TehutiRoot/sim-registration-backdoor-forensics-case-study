package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzka;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ep2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19760ep2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19760ep2 f61607a = new C19760ep2();

    /* renamed from: b */
    public static final FieldDescriptor f61608b;

    /* renamed from: c */
    public static final FieldDescriptor f61609c;

    /* renamed from: d */
    public static final FieldDescriptor f61610d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f61608b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f61609c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f61610d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzka zzkaVar = (zzka) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
