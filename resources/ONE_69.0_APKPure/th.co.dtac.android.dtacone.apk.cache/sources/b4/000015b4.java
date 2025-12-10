package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzif;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Wk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18746Wk2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18746Wk2 f7366a = new C18746Wk2();

    /* renamed from: b */
    public static final FieldDescriptor f7367b;

    /* renamed from: c */
    public static final FieldDescriptor f7368c;

    /* renamed from: d */
    public static final FieldDescriptor f7369d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("options");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f7367b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventType");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f7368c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f7369d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzif zzifVar = (zzif) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}