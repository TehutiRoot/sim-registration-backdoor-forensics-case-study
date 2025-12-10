package io.fotoapparat.hardware.display;

import android.content.Context;
import android.view.WindowManager;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m29142d2 = {"Landroid/content/Context;", "Landroid/view/Display;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/content/Context;)Landroid/view/Display;", "fotoapparat_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class DisplayKt {
    /* renamed from: a */
    public static final android.view.Display m30871a(Context context) {
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return ((WindowManager) systemService).getDefaultDisplay();
    }
}