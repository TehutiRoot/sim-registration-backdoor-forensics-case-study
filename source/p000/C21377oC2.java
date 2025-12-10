package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzph;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: oC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21377oC2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21377oC2 f72603a = new C21377oC2();

    /* renamed from: b */
    public static final FieldDescriptor f72604b;

    /* renamed from: c */
    public static final FieldDescriptor f72605c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("latencyMs");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f72604b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("logSceneBrightness");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f72605c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzph zzphVar = (zzph) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
