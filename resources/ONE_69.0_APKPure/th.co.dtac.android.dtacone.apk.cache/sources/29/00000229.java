package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpr;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: CD2 */
/* loaded from: classes3.dex */
public final class CD2 implements ObjectEncoder {

    /* renamed from: a */
    public static final CD2 f682a = new CD2();

    /* renamed from: b */
    public static final FieldDescriptor f683b;

    /* renamed from: c */
    public static final FieldDescriptor f684c;

    /* renamed from: d */
    public static final FieldDescriptor f685d;

    /* renamed from: e */
    public static final FieldDescriptor f686e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelInfo");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f683b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("initialDownloadConditions");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f684c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("updateDownloadConditions");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f685d = builder3.withProperty(zzfcVar3.zzb()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isModelUpdateEnabled");
        zzfc zzfcVar4 = new zzfc();
        zzfcVar4.zza(4);
        f686e = builder4.withProperty(zzfcVar4.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpr zzprVar = (zzpr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}