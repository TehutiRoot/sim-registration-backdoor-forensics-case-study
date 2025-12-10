package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zznb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* renamed from: Jr2 */
/* loaded from: classes3.dex */
public final class Jr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Jr2 f3129a = new Jr2();

    /* renamed from: b */
    public static final FieldDescriptor f3130b;

    /* renamed from: c */
    public static final FieldDescriptor f3131c;

    /* renamed from: d */
    public static final FieldDescriptor f3132d;

    /* renamed from: e */
    public static final FieldDescriptor f3133e;

    /* renamed from: f */
    public static final FieldDescriptor f3134f;

    /* renamed from: g */
    public static final FieldDescriptor f3135g;

    /* renamed from: h */
    public static final FieldDescriptor f3136h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("renderer");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f3130b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("vendor");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f3131c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f3132d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("maxImages");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f3133e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("maxSsbo");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f3134f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("workGroupSizes");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f3135g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("errorCode");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f3136h = builder7.withProperty(zzcqVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznb zznbVar = (zznb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}