package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: pt2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21664pt2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21664pt2 f76802a = new C21664pt2();

    /* renamed from: b */
    public static final FieldDescriptor f76803b;

    /* renamed from: c */
    public static final FieldDescriptor f76804c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("metric");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f76803b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("result");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f76804c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlq zzlqVar = (zzlq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
