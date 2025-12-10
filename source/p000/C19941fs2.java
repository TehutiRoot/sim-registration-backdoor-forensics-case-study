package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzky;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* renamed from: fs2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19941fs2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19941fs2 f61960a = new C19941fs2();

    /* renamed from: b */
    public static final FieldDescriptor f61961b;

    /* renamed from: c */
    public static final FieldDescriptor f61962c;

    /* renamed from: d */
    public static final FieldDescriptor f61963d;

    /* renamed from: e */
    public static final FieldDescriptor f61964e;

    /* renamed from: f */
    public static final FieldDescriptor f61965f;

    /* renamed from: g */
    public static final FieldDescriptor f61966g;

    /* renamed from: h */
    public static final FieldDescriptor f61967h;

    /* renamed from: i */
    public static final FieldDescriptor f61968i;

    /* renamed from: j */
    public static final FieldDescriptor f61969j;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f61961b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f61962c = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("source");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        f61963d = builder3.withProperty(zzcqVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("uri");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        f61964e = builder4.withProperty(zzcqVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hash");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        f61965f = builder5.withProperty(zzcqVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("modelType");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        f61966g = builder6.withProperty(zzcqVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("size");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        f61967h = builder7.withProperty(zzcqVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("hasLabelMap");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        f61968i = builder8.withProperty(zzcqVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("isManifestModel");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        f61969j = builder9.withProperty(zzcqVar9.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzky zzkyVar = (zzky) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
