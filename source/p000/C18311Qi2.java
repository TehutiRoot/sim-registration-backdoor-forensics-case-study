package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzhs;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Qi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18311Qi2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18311Qi2 f5140a = new C18311Qi2();

    /* renamed from: b */
    public static final FieldDescriptor f5141b;

    /* renamed from: c */
    public static final FieldDescriptor f5142c;

    /* renamed from: d */
    public static final FieldDescriptor f5143d;

    /* renamed from: e */
    public static final FieldDescriptor f5144e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("callingSource");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f5141b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("supportedFormats");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f5142c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("durationMs");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f5143d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f5144e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhs zzhsVar = (zzhs) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
