package p000;

import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import androidx.compose.p003ui.text.input.TextInputService;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: SF */
/* loaded from: classes2.dex */
public final class C1279SF implements SoftwareKeyboardController {

    /* renamed from: a */
    public final TextInputService f5775a;

    public C1279SF(TextInputService textInputService) {
        Intrinsics.checkNotNullParameter(textInputService, "textInputService");
        this.f5775a = textInputService;
    }

    @Override // androidx.compose.p003ui.platform.SoftwareKeyboardController
    public void hide() {
        this.f5775a.hideSoftwareKeyboard();
    }

    @Override // androidx.compose.p003ui.platform.SoftwareKeyboardController
    public /* synthetic */ void hideSoftwareKeyboard() {
        AbstractC19560dL1.m31846a(this);
    }

    @Override // androidx.compose.p003ui.platform.SoftwareKeyboardController
    public void show() {
        this.f5775a.showSoftwareKeyboard();
    }

    @Override // androidx.compose.p003ui.platform.SoftwareKeyboardController
    public /* synthetic */ void showSoftwareKeyboard() {
        AbstractC19560dL1.m31845b(this);
    }
}