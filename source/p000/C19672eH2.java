package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrz;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: eH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19672eH2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19672eH2 f61455a = new C19672eH2();

    /* renamed from: b */
    public static final FieldDescriptor f61456b;

    /* renamed from: c */
    public static final FieldDescriptor f61457c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorSpace");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f61456b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f61457c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrz zzrzVar = (zzrz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
