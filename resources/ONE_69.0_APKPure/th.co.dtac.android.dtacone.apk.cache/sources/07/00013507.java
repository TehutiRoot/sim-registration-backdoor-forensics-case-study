package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationInputNumberFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationInputNumberFragment$setupView$4;

@Metadata(m29143d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J(\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, m29142d2 = {"th/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationInputNumberFragment$setupView$4", "Landroid/text/TextWatcher;", "afterTextChanged", "", "userNameEt", "Landroid/text/Editable;", "beforeTextChanged", OperatorName.CLOSE_AND_STROKE, "", "start", "", "count", "after", "onTextChanged", "before", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationInputNumberFragment$setupView$4 */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationInputNumberFragment$setupView$4 implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ OneOnlineRegistrationInputNumberFragment f92703a;

    public OneOnlineRegistrationInputNumberFragment$setupView$4(OneOnlineRegistrationInputNumberFragment oneOnlineRegistrationInputNumberFragment) {
        this.f92703a = oneOnlineRegistrationInputNumberFragment;
    }

    /* renamed from: a */
    public static /* synthetic */ void m13037a(OneOnlineRegistrationInputNumberFragment oneOnlineRegistrationInputNumberFragment) {
        m13036b(oneOnlineRegistrationInputNumberFragment);
    }

    /* renamed from: b */
    public static final void m13036b(OneOnlineRegistrationInputNumberFragment this$0) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        imageView = this$0.f92696o;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearPhoneNumberImageView");
            imageView = null;
        }
        ViewVisibleExtKt.toGone(imageView);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable userNameEt) {
        Intrinsics.checkNotNullParameter(userNameEt, "userNameEt");
        if (userNameEt.length() == 12) {
            Handler handler = new Handler(Looper.getMainLooper());
            final OneOnlineRegistrationInputNumberFragment oneOnlineRegistrationInputNumberFragment = this.f92703a;
            handler.postDelayed(new Runnable() { // from class: p01
                @Override // java.lang.Runnable
                public final void run() {
                    OneOnlineRegistrationInputNumberFragment$setupView$4.m13037a(OneOnlineRegistrationInputNumberFragment.this);
                }
            }, 500L);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        boolean z;
        ImageView imageView;
        int i4;
        Intrinsics.checkNotNullParameter(s, "s");
        this.f92703a.f92700s = s.toString();
        z = this.f92703a.f92697p;
        if (z) {
            imageView = this.f92703a.f92696o;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clearPhoneNumberImageView");
                imageView = null;
            }
            if (s.length() > 0) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView.setVisibility(i4);
        }
    }
}