package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqm;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: aF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19019aF2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C19019aF2 f8390a = new C19019aF2();

    /* renamed from: b */
    public static final FieldDescriptor f8391b;

    /* renamed from: c */
    public static final FieldDescriptor f8392c;

    /* renamed from: d */
    public static final FieldDescriptor f8393d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("textEnhancementParam");
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f8391b = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("autoWhiteBalanceEnabled");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f8392c = builder2.withProperty(zzfcVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("lightnessEnhancementParam");
        zzfc zzfcVar3 = new zzfc();
        zzfcVar3.zza(3);
        f8393d = builder3.withProperty(zzfcVar3.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqm zzqmVar = (zzqm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}