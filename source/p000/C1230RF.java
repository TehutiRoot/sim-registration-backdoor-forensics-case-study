package p000;

import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import androidx.compose.p003ui.text.input.TextInputService;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: RF */
/* loaded from: classes2.dex */
public final class C1230RF implements SoftwareKeyboardController {

    /* renamed from: a */
    public final TextInputService f5302a;

    public C1230RF(TextInputService textInputService) {
        Intrinsics.checkNotNullParameter(textInputService, "textInputService");
        this.f5302a = textInputService;
    }

    @Override // androidx.compose.p003ui.platform.SoftwareKeyboardController
    public void hide() {
        this.f5302a.hideSoftwareKeyboard();
    }

    @Override // androidx.compose.p003ui.platform.SoftwareKeyboardController
    public /* synthetic */ void hideSoftwareKeyboard() {
        AbstractC20024gK1.m31146a(this);
    }

    @Override // androidx.compose.p003ui.platform.SoftwareKeyboardController
    public void show() {
        this.f5302a.showSoftwareKeyboard();
    }

    @Override // androidx.compose.p003ui.platform.SoftwareKeyboardController
    public /* synthetic */ void showSoftwareKeyboard() {
        AbstractC20024gK1.m31145b(this);
    }
}
