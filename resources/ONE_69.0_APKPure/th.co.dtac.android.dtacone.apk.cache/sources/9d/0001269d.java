package th.p047co.dtac.android.dtacone.util;

import androidx.fragment.app.FragmentManager;

/* renamed from: th.co.dtac.android.dtacone.util.FragmentUtil */
/* loaded from: classes8.dex */
public class FragmentUtil {
    public static void clearFragment(FragmentManager fragmentManager) {
        if (fragmentManager != null && !isEmptyStack(fragmentManager)) {
            fragmentManager.popBackStack((String) null, 1);
        }
    }

    public static boolean isEmptyStack(FragmentManager fragmentManager) {
        if (fragmentManager.getBackStackEntryCount() == 0) {
            return true;
        }
        return false;
    }

    public static int stackCount(FragmentManager fragmentManager) {
        return fragmentManager.getBackStackEntryCount();
    }
}