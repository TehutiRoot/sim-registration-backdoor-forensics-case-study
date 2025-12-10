package p000;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.platform.TextToolbar;
import kotlin.jvm.functions.Function0;

/* renamed from: mS1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC21074mS1 {
    /* renamed from: a */
    public static /* synthetic */ void m26255a(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, Object obj) {
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        if (obj == null) {
            if ((i & 2) != 0) {
                function05 = null;
            } else {
                function05 = function0;
            }
            if ((i & 4) != 0) {
                function06 = null;
            } else {
                function06 = function02;
            }
            if ((i & 8) != 0) {
                function07 = null;
            } else {
                function07 = function03;
            }
            if ((i & 16) != 0) {
                function08 = null;
            } else {
                function08 = function04;
            }
            textToolbar.showMenu(rect, function05, function06, function07, function08);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
    }
}
