package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzbo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Rg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18369Rg2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18369Rg2 f5393a = new C18369Rg2();

    /* renamed from: b */
    public static final FieldDescriptor f5394b;

    /* renamed from: c */
    public static final FieldDescriptor f5395c;

    /* renamed from: d */
    public static final FieldDescriptor f5396d;

    /* renamed from: e */
    public static final FieldDescriptor f5397e;

    /* renamed from: f */
    public static final FieldDescriptor f5398f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f5394b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f5395c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f5396d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f5397e = builder4.withProperty(zzaeVar4.zzb()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("recognizerOptions");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        f5398f = builder5.withProperty(zzaeVar5.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzbo zzboVar = (zzbo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
