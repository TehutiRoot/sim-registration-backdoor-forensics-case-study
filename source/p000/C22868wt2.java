package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzls;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: wt2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22868wt2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22868wt2 f108170a = new C22868wt2();

    /* renamed from: b */
    public static final FieldDescriptor f108171b;

    /* renamed from: c */
    public static final FieldDescriptor f108172c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("result");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f108171b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("ok");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f108172c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzls zzlsVar = (zzls) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
