package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: fl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19920fl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19920fl2 f61914a = new C19920fl2();

    /* renamed from: b */
    public static final FieldDescriptor f61915b;

    /* renamed from: c */
    public static final FieldDescriptor f61916c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("source");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f61915b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f61916c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlj zzljVar = (zzlj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
