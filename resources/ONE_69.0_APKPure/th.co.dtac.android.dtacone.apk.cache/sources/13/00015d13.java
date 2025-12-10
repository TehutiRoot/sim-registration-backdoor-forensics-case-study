package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.databinding.ZWhatsNewsBinding;
import th.p047co.dtac.android.dtacone.model.WhatNewCollection;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.CustomTabsUtil;
import th.p047co.dtac.android.dtacone.widget.dialog.NotifyUpdateDialog;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0019\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/NotifyUpdateDialog;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lth/co/dtac/android/dtacone/widget/dialog/NotifyUpdateDialog$OnUpdate;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "(Lth/co/dtac/android/dtacone/widget/dialog/NotifyUpdateDialog$OnUpdate;)V", "onUpdate", "onLaterUpdate", OperatorName.SAVE, "", "imageUrl", "t", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/dialog/NotifyUpdateDialog$OnUpdate;", "Lth/co/dtac/android/dtacone/databinding/ZWhatsNewsBinding;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/databinding/ZWhatsNewsBinding;", "binding", "Lth/co/dtac/android/dtacone/model/WhatNewCollection$Android;", OperatorName.CLOSE_AND_STROKE, "()Lth/co/dtac/android/dtacone/model/WhatNewCollection$Android;", "whatNewAndroid", PDPageLabelRange.STYLE_ROMAN_LOWER, "()Ljava/lang/String;", "changePageEvent", "Companion", "OnUpdate", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.NotifyUpdateDialog */
/* loaded from: classes9.dex */
public final class NotifyUpdateDialog extends BaseDialogFragment {

    /* renamed from: a */
    public OnUpdate f107342a;

    /* renamed from: b */
    public ZWhatsNewsBinding f107343b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/NotifyUpdateDialog$Companion;", "", "()V", Constant.EXTRA_EVENT, "", "EXTRA_WHAT_NEW", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/NotifyUpdateDialog;", "whatNewAndroid", "Lth/co/dtac/android/dtacone/model/WhatNewCollection$Android;", "changePageEvent", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.NotifyUpdateDialog$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final NotifyUpdateDialog newInstance(@Nullable WhatNewCollection.Android android2, @NotNull String changePageEvent) {
            Intrinsics.checkNotNullParameter(changePageEvent, "changePageEvent");
            NotifyUpdateDialog notifyUpdateDialog = new NotifyUpdateDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_WHAT_NEW_ANDROID", android2);
            bundle.putString(Constant.EXTRA_EVENT, changePageEvent);
            notifyUpdateDialog.setArguments(bundle);
            return notifyUpdateDialog;
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final NotifyUpdateDialog newInstance(@Nullable WhatNewCollection.Android android2) {
            NotifyUpdateDialog notifyUpdateDialog = new NotifyUpdateDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_WHAT_NEW_ANDROID", android2);
            notifyUpdateDialog.setArguments(bundle);
            return notifyUpdateDialog;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/NotifyUpdateDialog$OnUpdate;", "", "onClickLaterUpdate", "", "pages", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.NotifyUpdateDialog$OnUpdate */
    /* loaded from: classes9.dex */
    public interface OnUpdate {
        void onClickLaterUpdate(@Nullable String str);
    }

    @JvmStatic
    @NotNull
    public static final NotifyUpdateDialog newInstance(@Nullable WhatNewCollection.Android android2) {
        return Companion.newInstance(android2);
    }

    /* renamed from: u */
    public static final void m1560u(NotifyUpdateDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onUpdate();
    }

    /* renamed from: v */
    public static final void m1559v(NotifyUpdateDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onLaterUpdate();
    }

    /* renamed from: w */
    public static final boolean m1558w(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ZWhatsNewsBinding inflate = ZWhatsNewsBinding.inflate(inflater.cloneInContext(new ContextThemeWrapper(requireContext(), R.style.Theme_AppCompat_Dialog)), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(localInflater, container, false)");
        this.f107343b = inflate;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
        ZWhatsNewsBinding zWhatsNewsBinding = this.f107343b;
        ZWhatsNewsBinding zWhatsNewsBinding2 = null;
        if (zWhatsNewsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zWhatsNewsBinding = null;
        }
        zWhatsNewsBinding.progress.showNow();
        ZWhatsNewsBinding zWhatsNewsBinding3 = this.f107343b;
        if (zWhatsNewsBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zWhatsNewsBinding3 = null;
        }
        zWhatsNewsBinding3.tvUpdate.setOnClickListener(new View.OnClickListener() { // from class: oJ0
            {
                NotifyUpdateDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifyUpdateDialog.m1560u(NotifyUpdateDialog.this, view);
            }
        });
        ZWhatsNewsBinding zWhatsNewsBinding4 = this.f107343b;
        if (zWhatsNewsBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zWhatsNewsBinding4 = null;
        }
        zWhatsNewsBinding4.tvLaterUpdate.setOnClickListener(new View.OnClickListener() { // from class: pJ0
            {
                NotifyUpdateDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifyUpdateDialog.m1559v(NotifyUpdateDialog.this, view);
            }
        });
        if (m1562s() != null) {
            m1564q();
            WhatNewCollection.Android m1562s = m1562s();
            if (m1562s != null) {
                str = m1562s.getBannerUrl();
            } else {
                str = null;
            }
            m1561t(str);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: qJ0
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    boolean m1558w;
                    m1558w = NotifyUpdateDialog.m1558w(dialogInterface, i, keyEvent);
                    return m1558w;
                }
            });
        }
        ZWhatsNewsBinding zWhatsNewsBinding5 = this.f107343b;
        if (zWhatsNewsBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            zWhatsNewsBinding2 = zWhatsNewsBinding5;
        }
        return zWhatsNewsBinding2.getRoot();
    }

    public final void onLaterUpdate() {
        OnUpdate onUpdate = this.f107342a;
        if (onUpdate != null) {
            onUpdate.onClickLaterUpdate(m1563r());
        }
        dismiss();
    }

    public final void onUpdate() {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=th.co.dtac.android.dtacone")));
        } catch (ActivityNotFoundException unused) {
            CustomTabsUtil customTabsUtil = new CustomTabsUtil(new CustomTabsIntent.Builder());
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            customTabsUtil.openContentWebView(requireActivity, "https://play.google.com/store/apps/details?id=th.co.dtac.android.dtacone");
        }
    }

    /* renamed from: q */
    public final void m1564q() {
        if (m1562s() != null) {
            WhatNewCollection.Android m1562s = m1562s();
            Intrinsics.checkNotNull(m1562s);
            if (!m1562s.isForceUpdate()) {
                ZWhatsNewsBinding zWhatsNewsBinding = this.f107343b;
                if (zWhatsNewsBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zWhatsNewsBinding = null;
                }
                zWhatsNewsBinding.tvLaterUpdate.setVisibility(0);
            }
        }
    }

    /* renamed from: r */
    public final String m1563r() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(Constant.EXTRA_EVENT);
        }
        return null;
    }

    /* renamed from: s */
    public final WhatNewCollection.Android m1562s() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (WhatNewCollection.Android) arguments.getParcelable("EXTRA_WHAT_NEW_ANDROID");
        }
        return null;
    }

    public final void setListener(@NotNull OnUpdate listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f107342a = listener;
    }

    /* renamed from: t */
    public final void m1561t(String str) {
        RequestBuilder listener = Glide.with(this).m74229load(str).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).transition(DrawableTransitionOptions.withCrossFade()).listener(new RequestListener<Drawable>() { // from class: th.co.dtac.android.dtacone.widget.dialog.NotifyUpdateDialog$loadBanner$1
            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(@Nullable GlideException glideException, @Nullable Object obj, @NotNull Target<Drawable> target, boolean z) {
                ZWhatsNewsBinding zWhatsNewsBinding;
                Intrinsics.checkNotNullParameter(target, "target");
                zWhatsNewsBinding = NotifyUpdateDialog.this.f107343b;
                if (zWhatsNewsBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zWhatsNewsBinding = null;
                }
                zWhatsNewsBinding.progress.hideNow();
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(@NotNull Drawable resource, @NotNull Object model, @Nullable Target<Drawable> target, @NotNull DataSource dataSource, boolean z) {
                ZWhatsNewsBinding zWhatsNewsBinding;
                ZWhatsNewsBinding zWhatsNewsBinding2;
                Intrinsics.checkNotNullParameter(resource, "resource");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                zWhatsNewsBinding = NotifyUpdateDialog.this.f107343b;
                ZWhatsNewsBinding zWhatsNewsBinding3 = null;
                if (zWhatsNewsBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zWhatsNewsBinding = null;
                }
                zWhatsNewsBinding.ivBanner.setVisibility(0);
                zWhatsNewsBinding2 = NotifyUpdateDialog.this.f107343b;
                if (zWhatsNewsBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    zWhatsNewsBinding3 = zWhatsNewsBinding2;
                }
                zWhatsNewsBinding3.progress.hideNow();
                return false;
            }
        });
        ZWhatsNewsBinding zWhatsNewsBinding = this.f107343b;
        if (zWhatsNewsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zWhatsNewsBinding = null;
        }
        listener.into(zWhatsNewsBinding.ivBanner);
    }

    @JvmStatic
    @NotNull
    public static final NotifyUpdateDialog newInstance(@Nullable WhatNewCollection.Android android2, @NotNull String str) {
        return Companion.newInstance(android2, str);
    }
}