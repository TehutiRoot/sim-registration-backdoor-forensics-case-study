package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzhw;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: kj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20774kj2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20774kj2 f67998a = new C20774kj2();

    /* renamed from: b */
    public static final FieldDescriptor f67999b;

    /* renamed from: c */
    public static final FieldDescriptor f68000c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("type");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f67999b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("dims");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f68000c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhw zzhwVar = (zzhw) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
