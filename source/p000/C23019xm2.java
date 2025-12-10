package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzll;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: xm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23019xm2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23019xm2 f108505a = new C23019xm2();

    /* renamed from: b */
    public static final FieldDescriptor f108506b;

    /* renamed from: c */
    public static final FieldDescriptor f108507c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("deviceInfos");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f108506b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f108507c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzll zzllVar = (zzll) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
