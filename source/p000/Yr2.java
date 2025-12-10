package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zznh;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* renamed from: Yr2 */
/* loaded from: classes3.dex */
public final class Yr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Yr2 f7872a = new Yr2();

    /* renamed from: b */
    public static final FieldDescriptor f7873b;

    /* renamed from: c */
    public static final FieldDescriptor f7874c;

    /* renamed from: d */
    public static final FieldDescriptor f7875d;

    /* renamed from: e */
    public static final FieldDescriptor f7876e;

    /* renamed from: f */
    public static final FieldDescriptor f7877f;

    /* renamed from: g */
    public static final FieldDescriptor f7878g;

    /* renamed from: h */
    public static final FieldDescriptor f7879h;

    /* renamed from: i */
    public static final FieldDescriptor f7880i;

    /* renamed from: j */
    public static final FieldDescriptor f7881j;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        f7873b = builder.withProperty(zzayVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        f7874c = builder2.withProperty(zzayVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("source");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        f7875d = builder3.withProperty(zzayVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("uri");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        f7876e = builder4.withProperty(zzayVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hash");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        f7877f = builder5.withProperty(zzayVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("modelType");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        f7878g = builder6.withProperty(zzayVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("size");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        f7879h = builder7.withProperty(zzayVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("hasLabelMap");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        f7880i = builder8.withProperty(zzayVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("isManifestModel");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        f7881j = builder9.withProperty(zzayVar9.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznh zznhVar = (zznh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f7873b, zznhVar.zzd());
        objectEncoderContext.add(f7874c, (Object) null);
        objectEncoderContext.add(f7875d, zznhVar.zzb());
        objectEncoderContext.add(f7876e, (Object) null);
        objectEncoderContext.add(f7877f, zznhVar.zzc());
        objectEncoderContext.add(f7878g, zznhVar.zza());
        objectEncoderContext.add(f7879h, (Object) null);
        objectEncoderContext.add(f7880i, (Object) null);
        objectEncoderContext.add(f7881j, (Object) null);
    }
}
