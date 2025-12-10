package p000;

import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzqi;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* renamed from: nB2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21202nB2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C21202nB2 f72149a = new C21202nB2();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("x");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        builder.withProperty(zzayVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        builder2.withProperty(zzayVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqi zzqiVar = (zzqi) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
