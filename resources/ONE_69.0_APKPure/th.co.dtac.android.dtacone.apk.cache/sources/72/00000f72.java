package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsv;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* renamed from: QD2 */
/* loaded from: classes3.dex */
public final class QD2 implements ObjectEncoder {

    /* renamed from: a */
    public static final QD2 f5157a = new QD2();

    /* renamed from: b */
    public static final FieldDescriptor f5158b;

    /* renamed from: c */
    public static final FieldDescriptor f5159c;

    /* renamed from: d */
    public static final FieldDescriptor f5160d;

    /* renamed from: e */
    public static final FieldDescriptor f5161e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f5158b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("type");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f5159c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f5160d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("featureLevel");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f5161e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsv zzsvVar = (zzsv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}