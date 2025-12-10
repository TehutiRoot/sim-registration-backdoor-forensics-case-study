package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzbs;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Xh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18802Xh2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18802Xh2 f7624a = new C18802Xh2();

    /* renamed from: b */
    public static final FieldDescriptor f7625b;

    /* renamed from: c */
    public static final FieldDescriptor f7626c;

    /* renamed from: d */
    public static final FieldDescriptor f7627d;

    /* renamed from: e */
    public static final FieldDescriptor f7628e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("remoteModelOptions");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f7625b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("localModelOptions");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f7626c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCodes");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f7627d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("modelInitializationMs");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f7628e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzbs zzbsVar = (zzbs) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}