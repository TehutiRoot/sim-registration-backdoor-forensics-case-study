package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzja;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import org.apache.http.cookie.ClientCookie;

/* renamed from: Tl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18512Tl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18512Tl2 f6097a = new C18512Tl2();

    /* renamed from: b */
    public static final FieldDescriptor f6098b;

    /* renamed from: c */
    public static final FieldDescriptor f6099c;

    /* renamed from: d */
    public static final FieldDescriptor f6100d;

    /* renamed from: e */
    public static final FieldDescriptor f6101e;

    /* renamed from: f */
    public static final FieldDescriptor f6102f;

    /* renamed from: g */
    public static final FieldDescriptor f6103g;

    /* renamed from: h */
    public static final FieldDescriptor f6104h;

    /* renamed from: i */
    public static final FieldDescriptor f6105i;

    /* renamed from: j */
    public static final FieldDescriptor f6106j;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("name");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f6098b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(ClientCookie.VERSION_ATTR);
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f6099c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("source");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f6100d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("uri");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f6101e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("hash");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f6102f = builder5.withProperty(zzaeVar5.zzb()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("modelType");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        f6103g = builder6.withProperty(zzaeVar6.zzb()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("size");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        f6104h = builder7.withProperty(zzaeVar7.zzb()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("hasLabelMap");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        f6105i = builder8.withProperty(zzaeVar8.zzb()).build();
        FieldDescriptor.Builder builder9 = FieldDescriptor.builder("isManifestModel");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        f6106j = builder9.withProperty(zzaeVar9.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzja zzjaVar = (zzja) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
