package p000;

import androidx.compose.p003ui.focus.FocusProperties;
import androidx.compose.p003ui.focus.FocusRequester;
import kotlin.jvm.functions.Function1;

/* renamed from: pl */
/* loaded from: classes2.dex */
public final class C13110pl implements FocusProperties {

    /* renamed from: a */
    public static final C13110pl f76681a = new C13110pl();

    /* renamed from: b */
    public static Boolean f76682b;

    /* renamed from: a */
    public final boolean m23617a() {
        if (f76682b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m23616b() {
        f76682b = null;
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public boolean getCanFocus() {
        Boolean bool = f76682b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getDown() {
        return FocusProperties.CC.m59824a(this);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getEnd() {
        return FocusProperties.CC.m59823b(this);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ Function1 getEnter() {
        return FocusProperties.CC.m59822c(this);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ Function1 getExit() {
        return FocusProperties.CC.m59821d(this);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getLeft() {
        return FocusProperties.CC.m59820e(this);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getNext() {
        return FocusProperties.CC.m59819f(this);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getPrevious() {
        return FocusProperties.CC.m59818g(this);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getRight() {
        return FocusProperties.CC.m59817h(this);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getStart() {
        return FocusProperties.CC.m59816i(this);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getUp() {
        return FocusProperties.CC.m59815j(this);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public void setCanFocus(boolean z) {
        f76682b = Boolean.valueOf(z);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ void setDown(FocusRequester focusRequester) {
        FocusProperties.CC.m59814k(this, focusRequester);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ void setEnd(FocusRequester focusRequester) {
        FocusProperties.CC.m59813l(this, focusRequester);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ void setEnter(Function1 function1) {
        FocusProperties.CC.m59812m(this, function1);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ void setExit(Function1 function1) {
        FocusProperties.CC.m59811n(this, function1);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ void setLeft(FocusRequester focusRequester) {
        FocusProperties.CC.m59810o(this, focusRequester);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ void setNext(FocusRequester focusRequester) {
        FocusProperties.CC.m59809p(this, focusRequester);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ void setPrevious(FocusRequester focusRequester) {
        FocusProperties.CC.m59808q(this, focusRequester);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ void setRight(FocusRequester focusRequester) {
        FocusProperties.CC.m59807r(this, focusRequester);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ void setStart(FocusRequester focusRequester) {
        FocusProperties.CC.m59806s(this, focusRequester);
    }

    @Override // androidx.compose.p003ui.focus.FocusProperties
    public /* synthetic */ void setUp(FocusRequester focusRequester) {
        FocusProperties.CC.m59805t(this, focusRequester);
    }
}
