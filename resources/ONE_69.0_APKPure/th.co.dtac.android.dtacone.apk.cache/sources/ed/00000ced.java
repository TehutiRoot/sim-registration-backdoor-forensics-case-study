package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzaq;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Nf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18146Nf2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18146Nf2 f4222a = new C18146Nf2();

    /* renamed from: b */
    public static final FieldDescriptor f4223b;

    /* renamed from: c */
    public static final FieldDescriptor f4224c;

    /* renamed from: d */
    public static final FieldDescriptor f4225d;

    /* renamed from: e */
    public static final FieldDescriptor f4226e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f4223b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f4224c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f4225d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("options");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f4226e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzaq zzaqVar = (zzaq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}