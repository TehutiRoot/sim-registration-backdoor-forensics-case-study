package io.fotoapparat.result;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.hardware.ExecutorKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004*\u0016\u0010\u0007\"\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00020\u00060\u0005*\u0016\u0010\t\"\b\u0012\u0004\u0012\u00020\b0\u00052\b\u0012\u0004\u0012\u00020\b0\u0005¨\u0006\n"}, m28850d2 = {"Lkotlin/Function0;", "", "function", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlin/jvm/functions/Function0;)V", "Lio/fotoapparat/result/PendingResult;", "Lio/fotoapparat/capability/Capabilities;", "CapabilitiesResult", "Lio/fotoapparat/parameter/camera/CameraParameters;", "ParametersResult", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class PendingResultKt {
    /* renamed from: a */
    public static final void m30486a(Function0 function0) {
        ExecutorKt.executeMainThread(new PendingResultKt$notifyOnMainThread$1(function0));
    }
}
