package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* renamed from: Fs2 */
/* loaded from: classes3.dex */
public final class Fs2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Fs2 f1712a = new Fs2();

    /* renamed from: b */
    public static final FieldDescriptor f1713b;

    /* renamed from: c */
    public static final FieldDescriptor f1714c;

    /* renamed from: d */
    public static final FieldDescriptor f1715d;

    /* renamed from: e */
    public static final FieldDescriptor f1716e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f1713b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("type");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f1714c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f1715d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("featureLevel");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f1716e = builder4.withProperty(zzcqVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznd zzndVar = (zznd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
