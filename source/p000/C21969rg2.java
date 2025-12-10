package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzbi;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: rg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21969rg2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21969rg2 f77369a = new C21969rg2();

    /* renamed from: b */
    public static final FieldDescriptor f77370b;

    /* renamed from: c */
    public static final FieldDescriptor f77371c;

    /* renamed from: d */
    public static final FieldDescriptor f77372d;

    /* renamed from: e */
    public static final FieldDescriptor f77373e;

    /* renamed from: f */
    public static final FieldDescriptor f77374f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f77370b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f77371c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f77372d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f77373e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f77374f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzbi zzbiVar = (zzbi) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
