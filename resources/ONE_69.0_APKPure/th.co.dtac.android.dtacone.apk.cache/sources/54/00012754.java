package th.p047co.dtac.android.dtacone.util.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import javax.inject.Inject;

/* renamed from: th.co.dtac.android.dtacone.util.network.NetworkUtil */
/* loaded from: classes8.dex */
public class NetworkUtil {

    /* renamed from: c */
    public static int f87206c = 1;

    /* renamed from: d */
    public static int f87207d = 2;

    /* renamed from: e */
    public static int f87208e;

    /* renamed from: a */
    public TelephonyManager f87209a;

    /* renamed from: b */
    public ConnectivityManager f87210b;

    @Inject
    public NetworkUtil(TelephonyManager telephonyManager, ConnectivityManager connectivityManager) {
        this.f87209a = telephonyManager;
        this.f87210b = connectivityManager;
    }

    /* renamed from: a */
    public final int m16752a() {
        NetworkInfo activeNetworkInfo = this.f87210b.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() == 1) {
                return f87206c;
            }
            if (activeNetworkInfo.getType() == 0) {
                return f87207d;
            }
        }
        return f87208e;
    }

    public int[] getMobileNetworkCode() {
        int i;
        String networkOperator = this.f87209a.getNetworkOperator();
        int i2 = 0;
        if (networkOperator != null) {
            try {
                int parseInt = Integer.parseInt(networkOperator.substring(0, 3));
                i = Integer.parseInt(networkOperator.substring(3));
                i2 = parseInt;
            } catch (Exception unused) {
                return new int[]{0, 0};
            }
        } else {
            i = 0;
        }
        return new int[]{i2, i};
    }

    public String[] getMobileNetworkName() {
        return new String[]{this.f87209a.getNetworkOperatorName(), this.f87209a.getNetworkOperator(), this.f87209a.getNetworkCountryIso()};
    }

    public boolean isConnectDtacInternet() {
        if (!isConnectViaMobileData()) {
            return false;
        }
        int[] mobileNetworkCode = getMobileNetworkCode();
        int i = mobileNetworkCode[0];
        if (5 != i && 520 != i) {
            return false;
        }
        int i2 = mobileNetworkCode[1];
        if (520 != i2 && 18 != i2) {
            return false;
        }
        return true;
    }

    public boolean isConnectViaMobileData() {
        if (f87207d == m16752a()) {
            return true;
        }
        return false;
    }

    public boolean isConnectViaWifi() {
        if (f87206c == m16752a()) {
            return true;
        }
        return false;
    }

    public boolean isConnected() {
        if (f87208e != m16752a()) {
            return true;
        }
        return false;
    }
}