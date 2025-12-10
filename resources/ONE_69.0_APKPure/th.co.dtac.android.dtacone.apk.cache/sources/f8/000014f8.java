package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznn;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Vy2 */
/* loaded from: classes3.dex */
public final class Vy2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Vy2 f7155a = new Vy2();

    /* renamed from: b */
    public static final FieldDescriptor f7156b;

    /* renamed from: c */
    public static final FieldDescriptor f7157c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("maxResults");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f7156b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("modelType");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f7157c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznn zznnVar = (zznn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}