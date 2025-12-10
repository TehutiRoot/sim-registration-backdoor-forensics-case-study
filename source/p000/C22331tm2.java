package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* renamed from: tm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22331tm2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C22331tm2 f107199a = new C22331tm2();

    /* renamed from: b */
    public static final FieldDescriptor f107200b;

    /* renamed from: c */
    public static final FieldDescriptor f107201c;

    /* renamed from: d */
    public static final FieldDescriptor f107202d;

    /* renamed from: e */
    public static final FieldDescriptor f107203e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f107200b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("type");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f107201c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f107202d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("featureLevel");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f107203e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlk zzlkVar = (zzlk) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
