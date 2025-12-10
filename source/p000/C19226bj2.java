package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzhu;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: bj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19226bj2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19226bj2 f39177a = new C19226bj2();

    /* renamed from: b */
    public static final FieldDescriptor f39178b;

    /* renamed from: c */
    public static final FieldDescriptor f39179c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f39178b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f39179c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhu zzhuVar = (zzhu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
