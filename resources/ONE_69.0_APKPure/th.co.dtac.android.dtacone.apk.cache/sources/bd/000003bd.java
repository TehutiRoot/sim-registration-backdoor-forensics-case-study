package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzlt;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: Dv2 */
/* loaded from: classes3.dex */
public final class Dv2 implements ObjectEncoder {

    /* renamed from: a */
    public static final Dv2 f1179a = new Dv2();

    /* renamed from: b */
    public static final FieldDescriptor f1180b;

    /* renamed from: c */
    public static final FieldDescriptor f1181c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("confidence");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f1180b = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE);
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f1181c = builder2.withProperty(zzcqVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlt zzltVar = (zzlt) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}