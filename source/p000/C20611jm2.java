package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: jm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20611jm2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20611jm2 f67368a = new C20611jm2();

    /* renamed from: b */
    public static final FieldDescriptor f67369b;

    /* renamed from: c */
    public static final FieldDescriptor f67370c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("eventType");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f67369b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f67370c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjd zzjdVar = (zzjd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
