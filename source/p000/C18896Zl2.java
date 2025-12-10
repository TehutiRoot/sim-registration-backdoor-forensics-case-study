package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzjc;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: Zl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18896Zl2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C18896Zl2 f8125a = new C18896Zl2();

    /* renamed from: b */
    public static final FieldDescriptor f8126b;

    /* renamed from: c */
    public static final FieldDescriptor f8127c;

    /* renamed from: d */
    public static final FieldDescriptor f8128d;

    /* renamed from: e */
    public static final FieldDescriptor f8129e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelInfo");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f8126b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("initialDownloadConditions");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f8127c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("updateDownloadConditions");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f8128d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isModelUpdateEnabled");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f8129e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjc zzjcVar = (zzjc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
