package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: np2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21308np2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21308np2 f72466a = new C21308np2();

    /* renamed from: b */
    public static final FieldDescriptor f72467b;

    /* renamed from: c */
    public static final FieldDescriptor f72468c;

    /* renamed from: d */
    public static final FieldDescriptor f72469d;

    /* renamed from: e */
    public static final FieldDescriptor f72470e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f72467b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f72468c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("identifyLanguageResult");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        f72469d = builder3.withProperty(zzaeVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("identifyPossibleLanguagesResult");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        f72470e = builder4.withProperty(zzaeVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkf zzkfVar = (zzkf) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
