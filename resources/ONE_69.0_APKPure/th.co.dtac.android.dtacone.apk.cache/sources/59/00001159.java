package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsd;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: SF2 */
/* loaded from: classes3.dex */
public final class SF2 implements ObjectEncoder {

    /* renamed from: a */
    public static final SF2 f5778a = new SF2();

    /* renamed from: b */
    public static final FieldDescriptor f5779b;

    /* renamed from: c */
    public static final FieldDescriptor f5780c;

    /* renamed from: d */
    public static final FieldDescriptor f5781d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("languageOption");
        zzct zzctVar = new zzct();
        zzctVar.zza(3);
        f5779b = builder.withProperty(zzctVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isUsingLegacyApi");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(4);
        f5780c = builder2.withProperty(zzctVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(5);
        f5781d = builder3.withProperty(zzctVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(f5779b, ((zzsd) obj).zza());
        objectEncoderContext.add(f5780c, (Object) null);
        objectEncoderContext.add(f5781d, (Object) null);
    }
}