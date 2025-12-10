package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: bt2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19304bt2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19304bt2 f39249a = new C19304bt2();

    /* renamed from: b */
    public static final FieldDescriptor f39250b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelLanguage");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f39250b = builder.withProperty(zzaeVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkw zzkwVar = (zzkw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}