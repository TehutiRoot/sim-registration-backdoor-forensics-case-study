package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzbc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Zg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18928Zg2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18928Zg2 f8233a = new C18928Zg2();

    /* renamed from: b */
    public static final FieldDescriptor f8234b;

    /* renamed from: c */
    public static final FieldDescriptor f8235c;

    /* renamed from: d */
    public static final FieldDescriptor f8236d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f8234b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isColdCall");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f8235c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f8236d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzbc zzbcVar = (zzbc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}