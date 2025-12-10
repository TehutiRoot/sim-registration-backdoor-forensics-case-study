package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ip2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20448ip2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20448ip2 f67064a = new C20448ip2();

    /* renamed from: b */
    public static final FieldDescriptor f67065b;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("optionsType");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f67065b = builder.withProperty(zzaeVar.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkb zzkbVar = (zzkb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
