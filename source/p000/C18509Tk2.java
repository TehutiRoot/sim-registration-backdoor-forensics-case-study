package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzik;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Tk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18509Tk2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18509Tk2 f6091a = new C18509Tk2();

    /* renamed from: b */
    public static final FieldDescriptor f6092b;

    /* renamed from: c */
    public static final FieldDescriptor f6093c;

    /* renamed from: d */
    public static final FieldDescriptor f6094d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("detectorOptions");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f6092b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f6093c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f6094d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzik zzikVar = (zzik) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
