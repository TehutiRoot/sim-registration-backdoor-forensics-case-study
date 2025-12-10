package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zztd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: dI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19503dI2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19503dI2 f61128a = new C19503dI2();

    /* renamed from: b */
    public static final FieldDescriptor f61129b;

    /* renamed from: c */
    public static final FieldDescriptor f61130c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("result");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f61129b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("ok");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f61130c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zztd zztdVar = (zztd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
