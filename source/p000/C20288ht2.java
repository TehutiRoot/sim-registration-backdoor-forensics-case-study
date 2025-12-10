package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: ht2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20288ht2 implements ObjectEncoder {

    /* renamed from: a */
    public static final C20288ht2 f62623a = new C20288ht2();

    /* renamed from: b */
    public static final FieldDescriptor f62624b;

    /* renamed from: c */
    public static final FieldDescriptor f62625c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("sourceLanguage");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f62624b = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("targetLanguage");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f62625c = builder2.withProperty(zzaeVar2.zzb()).build();
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlg zzlgVar = (zzlg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
