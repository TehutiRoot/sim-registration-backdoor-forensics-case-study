package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoh;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: jA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20511jA2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20511jA2 f67194a = new C20511jA2();

    /* renamed from: b */
    public static final FieldDescriptor f67195b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("useCases");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f67195b = builder.withProperty(zzfcVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzoh zzohVar = (zzoh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
