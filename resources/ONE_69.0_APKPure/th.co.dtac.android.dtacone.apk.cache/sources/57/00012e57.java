package th.p047co.dtac.android.dtacone.view.appOne.device_sale.dialog.listener;

import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/dialog/listener/OneDeviceSaleCustomOnClickListener;", "", "onCancel", "", "onConfirm", Promotion.ACTION_VIEW, "Landroid/view/View;", "type", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.dialog.listener.OneDeviceSaleCustomOnClickListener */
/* loaded from: classes10.dex */
public interface OneDeviceSaleCustomOnClickListener {
    void onCancel();

    void onConfirm(@NotNull View view, @NotNull String str);
}