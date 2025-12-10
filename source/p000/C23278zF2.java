package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* renamed from: zF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23278zF2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C23278zF2 f109017a = new C23278zF2();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("x");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        builder.withProperty(zzctVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        builder2.withProperty(zzctVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzsg zzsgVar = (zzsg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
