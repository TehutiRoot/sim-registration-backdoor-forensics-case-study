package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfy;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: lu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20979lu2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20979lu2 f71761a = new C20979lu2();

    /* renamed from: b */
    public static final FieldDescriptor f71762b;

    /* renamed from: c */
    public static final FieldDescriptor f71763c;

    /* renamed from: d */
    public static final FieldDescriptor f71764d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f71762b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f71763c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f71764d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzfy zzfyVar = (zzfy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
