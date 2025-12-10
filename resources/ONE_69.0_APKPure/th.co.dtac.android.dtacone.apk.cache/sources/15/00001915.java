package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zztd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: aJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19031aJ2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19031aJ2 f8407a = new C19031aJ2();

    /* renamed from: b */
    public static final FieldDescriptor f8408b;

    /* renamed from: c */
    public static final FieldDescriptor f8409c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("result");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f8408b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("ok");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f8409c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zztd zztdVar = (zztd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}