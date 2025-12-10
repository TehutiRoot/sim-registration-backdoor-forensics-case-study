package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* renamed from: Ek2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17549Ek2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C17549Ek2 f1369a = new C17549Ek2();

    /* renamed from: b */
    public static final FieldDescriptor f1370b;

    /* renamed from: c */
    public static final FieldDescriptor f1371c;

    /* renamed from: d */
    public static final FieldDescriptor f1372d;

    /* renamed from: e */
    public static final FieldDescriptor f1373e;

    /* renamed from: f */
    public static final FieldDescriptor f1374f;

    /* renamed from: g */
    public static final FieldDescriptor f1375g;

    /* renamed from: h */
    public static final FieldDescriptor f1376h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("renderer");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f1370b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("vendor");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f1371c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f1372d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("maxImages");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f1373e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("maxSsbo");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f1374f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("workGroupSizes");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f1375g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f1376h = builder7.withProperty(zzaeVar7.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzli zzliVar = (zzli) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
