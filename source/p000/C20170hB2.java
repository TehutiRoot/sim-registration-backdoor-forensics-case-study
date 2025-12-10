package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzov;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: hB2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20170hB2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20170hB2 f62436a = new C20170hB2();

    /* renamed from: b */
    public static final FieldDescriptor f62437b;

    /* renamed from: c */
    public static final FieldDescriptor f62438c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("scoreType");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f62437b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(FirebaseAnalytics.Param.SCORE);
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f62438c = builder2.withProperty(zzfcVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzov zzovVar = (zzov) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
