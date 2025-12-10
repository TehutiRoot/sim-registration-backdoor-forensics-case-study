package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: vs2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22693vs2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22693vs2 f107826a = new C22693vs2();

    /* renamed from: b */
    public static final FieldDescriptor f107827b;

    /* renamed from: c */
    public static final FieldDescriptor f107828c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f107827b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("textDetectionOptions");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f107828c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlb zzlbVar = (zzlb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
