package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzks;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: lr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20970lr2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20970lr2 f71737a = new C20970lr2();

    /* renamed from: b */
    public static final FieldDescriptor f71738b;

    /* renamed from: c */
    public static final FieldDescriptor f71739c;

    /* renamed from: d */
    public static final FieldDescriptor f71740d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("languageOption");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(3);
        f71738b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isUsingLegacyApi");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(4);
        f71739c = builder2.withProperty(zzaeVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(5);
        f71740d = builder3.withProperty(zzaeVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzks zzksVar = (zzks) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
