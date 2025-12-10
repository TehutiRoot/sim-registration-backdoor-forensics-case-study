package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: VE2 */
/* loaded from: classes3.dex */
public final class VE2 implements ObjectEncoder {

    /* renamed from: a */
    public static final VE2 f6594a = new VE2();

    /* renamed from: b */
    public static final FieldDescriptor f6595b;

    /* renamed from: c */
    public static final FieldDescriptor f6596c;

    /* renamed from: d */
    public static final FieldDescriptor f6597d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("languageOption");
        zzct zzctVar = new zzct();
        zzctVar.zza(3);
        f6595b = builder.withProperty(zzctVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isUsingLegacyApi");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(4);
        f6596c = builder2.withProperty(zzctVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(5);
        f6597d = builder3.withProperty(zzctVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f6595b, ((zzsd) obj).zza());
        objectEncoderContext.add(f6596c, (Object) null);
        objectEncoderContext.add(f6597d, (Object) null);
    }
}
