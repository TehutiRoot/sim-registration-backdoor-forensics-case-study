package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsu;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: oB2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21374oB2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21374oB2 f72599a = new C21374oB2();

    /* renamed from: b */
    public static final FieldDescriptor f72600b;

    /* renamed from: c */
    public static final FieldDescriptor f72601c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("source");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f72600b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f72601c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsu zzsuVar = (zzsu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
